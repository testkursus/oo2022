import java.io.*;
public class Kirjutamine1{
	public static void main(String[] arg) throws IOException{
		PrintWriter pw1=new PrintWriter(
		  new FileWriter("valjund1.txt"));
		pw1.println("Tere, Juku!");
		pw1.println("Varsti hakkab koolivaheaeg");
		pw1.close();
	}
}