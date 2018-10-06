package zsk;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.WindowConstants;



public class MyFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static int WIDTH=300;
	public static int HEIGHT=250;
	public static String TITLE="函数查找性能比较";
	
	//x用来接收主函数中传来得知坐标
	List<Integer> x;
	//分别用来接收主函数传来的y坐标
	List<Integer> yList;
	List<Integer> ySet;
	List<Integer> yHash;
	
	public MyFrame(List<Integer> x2, List<Integer> yList2, List<Integer> ySet2, List<Integer> yHash2) {
		// TODO Auto-generated constructor stub
		super();
		this.x=x2;
		this.yList=yList2;
		this.ySet=ySet2;
		this.yHash=yHash2;
		initFrame();
	}
	private void initFrame() {
		// TODO Auto-generated method stub
		//设置窗口大小
		setTitle(TITLE);
		setSize(WIDTH, HEIGHT);
		//设置点击关闭退出（Java中默认关闭是关闭不了的）
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//让对话框居中屏幕显示
		setLocationRelativeTo(null);
		 // 设置窗口的内容面板
        MyPanel panel = new MyPanel(this,x,yList,ySet,yHash);
        setContentPane(panel);

		
	}
}
