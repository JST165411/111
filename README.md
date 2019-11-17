字符串实验
==========
实验目的
--------
1、掌握字符串String及其方法的使用<br>
2、掌握异常处理结构<br>

实验内容
--------
内容：利用已学的字符串处理知识完成《长恨歌》古诗的整理对其工作，写出功能函数，并运行。达到如下功能：<br>
1、每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”<br>
2、允许提供输入参数，统计古诗中某个汉字或词出现的次数。<br>
3、考虑操作中可能出现的异常，在程序中设计异常处理程序。<br>
核心代码
--------
```
public static StringBuffer Add(StringBuffer str) {
StringBuffer str1=new StringBuffer();
for(int i=0;i<str.length()/7;i++){
str1.append(str.substring(7*i,7*(i+1)));
if((i+1)%2!=0){
str1.append("，");
}
else{
str1.append("。").append("\n");
}
}
return str1;
}
```
添加“，”“。”的子函数<br>
设置`for`循环中套一个`if`条件如果奇数加“，”否则加“。”<br>
