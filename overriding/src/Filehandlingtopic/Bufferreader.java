package Filehandlingtopic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Bufferreader {
public static void main(String[] args) throws Exception {
File  f1=new File("C:\\Users\\vikee\\Desktop\\vik");
FileReader fr=new FileReader(f1);
	BufferedReader br=new BufferedReader(fr);
	String s1=br.readLine();
	while(s1!=null){
		System.out.println(s1);
		s1=br.readLine();
	}
}
}
