package zsk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchTimeComp {
	private long startTime;
	private long endTime;
	int enlarge=4;//扩大时间，便于观察
	private List<String> listString;
	private Set<String> setString ;
	private HashSet<String> hashString;
	
	public SearchTimeComp() {
		startTime=0;
		endTime=0;
		enlarge=20;
		//开辟待测试函数对象
		listString=new ArrayList<>();
		setString=new HashSet<>();
		hashString=new HashSet<>();

	}
	
	//对待测试的函数先初始化（给每个元素都赋值，方便查询时使用）
	public void initFunction(int num) {
		//通过循环给集合中添加num个数
		for(int i=0;i<num;i++) {
			listString.add(String.valueOf(i));
			setString.add(String.valueOf(i));
			hashString.add(String.valueOf(i));	
			System.out.print(listString.get(i));
			
		}
	}
	
	public long timeOfList(int searchnum) {
		startTime=System.currentTimeMillis();//获取系统当前时间
		listString.contains(String.valueOf(searchnum));//查找值为searchnum的数
		endTime=System.currentTimeMillis();
		return enlarge*(endTime-startTime);
	}
	
	public long timeOfSet(int searchnum) {
		startTime=System.currentTimeMillis();//获取系统当前时间
		setString.contains(String.valueOf(searchnum));
		endTime=System.currentTimeMillis();
		return enlarge*(endTime-startTime);
	}
	
	public long timeOfHashSet(int searchnum) {
		startTime=System.currentTimeMillis();//获取系统当前时间
		hashString.contains(String.valueOf(searchnum));
		endTime=System.currentTimeMillis();
		return enlarge*(endTime-startTime);
	}

}
