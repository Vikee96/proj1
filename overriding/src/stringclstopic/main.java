package stringclstopic;

public class main {
public static void main(String[] args) {
	System.out.println("*****without new operator***");
	String s1="hello";
	String s2="hello";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println("*****with new operator*****");
	String s3=new String("hii");
	String s4=new String("hii");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
}
