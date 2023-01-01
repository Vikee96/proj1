package Filehandlingtopic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwriterrr {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\vikee\\Desktop\\vik");
	FileWriter fw=new FileWriter(f1);
	BufferedWriter bw =new BufferedWriter(fw);
	bw.write("hello java");
	bw.newLine();
	bw.write("cool java");
	bw.newLine();
	bw.write("cool mava");
	bw.flush();
	System.out.println("data is written..");
}
}
