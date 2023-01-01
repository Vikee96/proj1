package Filehandlingtopic;

import java.io.File;
import java.io.IOException;

public class File2 {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\vikee\\Desktop\\vik");
	if(f1.createNewFile()){
		System.out.println("file is created");
	}
	else{
		System.out.println("file is not Created");
	}
	
}
}
