package Filehandlingtopic;

import java.io.File;
import java.io.IOException;

public class Filehandl {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\vikee\\Desktop\\JOb.txt");
	if(f1.createNewFile())
	{
		System.out.println("file is created..");
	}
	else{
		System.out.println("file is not created");
	}
}
}
