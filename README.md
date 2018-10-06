<h1 align=center>函数查找性能测试</h1>
<h2>简介</h2>
本程序比较了List、set、HashSet查找某值的所用时间的长短，分别给这三个集合先插入二十万个数（可以更多，但由于个人电脑原因只用200000），本程序通过画图的形式显示了这三个函数查找时间的折线图（左上角为原点），图中横坐标单位长度为10个像素点，纵坐标进行了放大，因为查找时间太短，画出来的图效果不明显，其中有两条线都绘制在了x轴上，那就是set和hashset查找用时几乎为0，所以本程序还需要扩大插入的数据来检测set和hashset的性能，但是个人电脑运行太慢，未实现，运行结果如下：
<div align=center><img src="https://github.com/xyygudu/ListHash/blob/master/images/AU2~2KP0%40_JW%5D3%24)%7DS77_TD.png" width=350px/></div>
<div align=center><img src="https://github.com/xyygudu/ListHash/blob/master/images/%5B%5DZ0B%7DY%60Q3ZWO3K8MLF(S%40B.png" width=350px/></div>
<div align=center><img src="https://github.com/xyygudu/ListHash/blob/master/images/LN%5DD%7BDS0VQ_N%602ND%5D%7B4RATM.png" width=350px/></div>
<div align=center><img src="https://github.com/xyygudu/ListHash/blob/master/images/H0C%60U%7DA)2C1KCP~WBVZ%25XFO.png" width=350px/></div>
<h2>Myframe类</h2>
该类的作用是绘制图形界面，为画折线图做好铺垫，在该类中，设置了对话框的宽高和对话框名字，然后还定义了4个list用与存放横坐标和三个函数查找时间作为纵坐标，在这个类的initFrame方法中开辟了MyPanel对象（用于画折线图），并将坐标传给该对象。
<h2>MyPanel类</h2>
由于数据量还算大，如果通过excel画图将是一个十分麻烦的过程，所以在此类中，就是用得到的坐标来绘制折线图，该类中定义了drawLine方法，将得到的坐标通过Graphics绘制在窗口上
<h2>SearchTimeComple类</h2>
在该类构造函数需要对待测试的集合函数开辟对象，然后有插入数据的方法initFunction，向集合中添加最多二十万的数（个人的电脑就是这里运行效率贼低，代码不够优化导致的），然后就是测这三个函数查找某值用时的方法
<h2>MainCtrl类</h2>
该类通过循环调用searchTimeComp类中的initFunction方法分别给三个待测试的函数插入数据，然后计算三个函数执行的时间
