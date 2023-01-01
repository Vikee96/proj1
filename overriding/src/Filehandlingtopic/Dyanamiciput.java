package Filehandlingtopic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dyanamiciput {
public static void main(String[] args) throws IOException {
//InputStreamReader isr=new InputStremReader(System.inn);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the data");
String s1=br.readLine();
System.out.println(s1);
}
}
