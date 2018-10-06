package zsk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainCtrl {
	
	//生成0-num的随机数，便于后面查询用
	public int creatRandom(int number) {
		Random random=new Random();
		return random.nextInt(number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("dgklg");
		MainCtrl mainCtrl=new MainCtrl();
		//创建一个SearchTimeComp类，便于调用类里的函数
		SearchTimeComp searchTimeComp=new SearchTimeComp();
	
		//searchnum是用于查找
		int num=200000;//num为100万，表示测试最多为一百万
	
		//待测试的三个函数的很坐标都一样，所以用一个list来存
		List<Integer> x=new ArrayList<>();
		
		//开辟3个list用于存放每种函数用时多少，作为有坐标用于画图
		List<Integer> yList=new ArrayList<>();
		List<Integer> ySet=new ArrayList<>();
		List<Integer> yHash=new ArrayList<>();
		
		
		for(int i=10000;i<=num;i+=10000) {
			searchTimeComp.initFunction(i);//给待测试的集合都赋初值，便于下面进行查找操作
			int searchnum=i/2;//mainCtrl.creatRandom(i);//产生从0到i的随机整数
			x.add((i/10000)*10);//初始化横坐标
			
			//记录各函数用时作为纵坐标
			yList.add((int)searchTimeComp.timeOfList(searchnum));
			ySet.add((int)searchTimeComp.timeOfSet(searchnum));
			yHash.add((int)searchTimeComp.timeOfHashSet(searchnum));
			long time= searchTimeComp.timeOfList(searchnum);
			System.out.print(time+" ");
			
		}
		MyFrame frame=new MyFrame(x, yList, ySet, yHash);

		frame.setVisible(true);
		
		
	}

}
