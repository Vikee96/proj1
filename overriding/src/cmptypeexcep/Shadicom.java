package cmptypeexcep;
class MarrageException extends Exception
{
	String msg;
	MarrageException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Shadicom {
 static void submit()throws MarrageException
 {
	int age=14;
	if(age>=21)
	{
		System.out.println("happy marage life");
	}
	else
	{
		throw new MarrageException("invalid age");
	}
 }
 public static void main(String[] args) {
	try{
	 submit();
	}
	catch(MarrageException e)
	{
	System.out.println(e.getmessage());	
	}
}
}
