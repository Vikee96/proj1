package Filehandlingtopic;
  
import java.io.File;

public class Filehandle {
public static void main(String[] args) {
	File f1=new File("C:\\Users\\vikee\\Desktop\\JObb");
	if(f1.mkdirs())
	{
	System.out.println("folder is created");	
	}
	else
	{
		System.out.println("folder is not created");
	}
	if(f1.exists())
	{
		System.out.println("folder is exist");
	}
	else
	{
		System.out.println("folder is not exist");
	}
	if(f1.delete())
	{
		System.out.println("folder is deleted");
	}
	else
	{
		System.out.println("folder is not deleted");
	}
}
}
