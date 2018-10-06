package zsk;

import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.List;

import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;

public class MyPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//x用来接收MyFrame中传来得知坐标
	List<Integer> x;
	//分别用来接收MyFrame传来的y坐标
	List<Integer> yList;
	List<Integer> ySet;
	List<Integer> yHash;
	public MyPanel(MyFrame frame,List<Integer> x,List<Integer> yList,List<Integer> ySet,List<Integer> yHash) {
		// TODO Auto-generated constructor stub
		super();
		//通过构造函数接收主函数中求出的坐标
		this.x=x;
		this.yList=yList;
		this.ySet=ySet;
		this.yHash=yHash;
	}
	 /**
     * 绘制面板的内容: 创建 JPanel 后会调用一次该方法绘制内容,
     * 之后如果数据改变需要重新绘制, 可调用 updateUI() 方法触发
     * 系统再次调用该方法绘制更新 JPanel 的内容。
     */
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		drawLine(g);
	}
	private void drawLine(Graphics g) {
		// TODO Auto-generated method stub
		 Graphics2D g2d = (Graphics2D) g.create();
		 Stroke stroke=new BasicStroke(3.0f);//设置线宽为3.0
		 g2d.setStroke(stroke);
		 // 抗锯齿
         g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         // 设置画笔颜色
         g2d.setColor(Color.green);
         // 多点绘制折线:
         int[] xx=new int[x.size()];
         int[] yl=new int[yList.size()];      
         int[] ys=new int[ySet.size()];
         int[] yh=new int[yHash.size()];
         //将integer转int
         for(int i = 0;i<x.size();i++){
        	    xx[i] = x.get(i);
        	    yl[i]=yList.get(i);
        	    ys[i]=ySet.get(i);
        	    yh[i]=yHash.get(i);
         }

         
         g2d.drawPolyline(xx, yl, x.size());
         g2d.drawPolyline(xx, ys, x.size());
         g2d.drawPolyline(xx, yh, x.size());
        

	}
	

}

















