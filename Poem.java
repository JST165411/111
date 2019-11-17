package ll2;

import java.util.Scanner;

public class Poem {
public static void main(String[] args)
{
 System.out.print("请输入《长恨歌》\n");
 Scanner p=new Scanner(System.in);
 String temp=p.nextLine();
 StringBuffer str=new StringBuffer(temp);
 StringBuffer str0=new StringBuffer();
 str0=Add(str);
 String str1=new String(str0);
 System.out.print(str1);
 System.out.print("请输入您要查找的字\n");
 Scanner p1=new Scanner(System.in);
 String temp1=p1.nextLine();
 int i=Find(temp,temp1);
 System.out.print(i);
}
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
public static int Find(String orgstr,String findstr){
 int x=0;
 while(orgstr.indexOf(findstr)!=-1){
  if(orgstr.indexOf(findstr)!=-1){
   x++;
   orgstr=orgstr.substring(orgstr.indexOf(findstr)+findstr.l