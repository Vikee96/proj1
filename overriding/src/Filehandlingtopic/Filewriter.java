package Filehandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
public static void main(String[] args) throws IOException {
File f1=new File("C:\\Users\\vikee\\Desktop\\JOb");
FileWriter fw=new FileWriter(f1);
fw.write("employe is working in ibm");
fw.flush();
System.out.println(("data is writen"));
}
}
