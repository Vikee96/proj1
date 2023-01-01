package hascodtopic;

public class Sample {
public static void main(String[] args) {
	Sample s1=new Sample();
	System.out.println(s1.hashCode());
	//Sample s2=s1;
	Sample s2=new Sample();
	System.out.println(s2.hashCode());
}
}
