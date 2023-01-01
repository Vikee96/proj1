package Charactertopic;

public class Print3rdchr {
public static void main(String[] args) {
	String str="abcdeg";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		int no=(int)ch+3;
		char ch1=(char)no;
		System.out.println(ch1);
	}
}
}
