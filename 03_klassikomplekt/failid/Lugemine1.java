import java.io.*;
public class Lugemine1{
	public static void main(String[] arg) throws IOException{
		BufferedReader br1=new BufferedReader(
		      new FileReader("isikud.txt"));
	    String rida1=br1.readLine();
		String[] m=rida1.split(" ");
		String eesnimi=m[0];
		String pikkusStr=m[1];
		int sentimeetrid=Integer.parseInt(pikkusStr);
		double meetrid=sentimeetrid/100.0;
		System.out.println(eesnimi+" pikkusega meetrites "+meetrid);
	}
}