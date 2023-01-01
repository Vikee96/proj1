package Filehandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writeappend {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\vikee\\Desktop\\JOb");
  FileWriter fw=new FileWriter(f1,true);//append mode
  fw.write("imploye is working in wipro");
  fw.flush();
  System.out.println("dadat is written..");
}
}
