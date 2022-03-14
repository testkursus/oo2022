import java.util.*;
import java.io.*;
public class Proov1{
	public static void main(String[] arg) throws IOException{
		ManguTuum mt=new ManguTuum1();
		mt.ounaleJuhuslikKoht();
		System.out.println(Arrays.toString(mt.ounaKoht()));
		//System.out.println(Arrays.toString(mt.ounaKoht()));
		mt.paremale();
		mt.samm();
	    mt.samm();
		System.out.println(Arrays.deepToString(mt.ussiKohad()));
		new TuumaKaivitaja(mt);
		//Hoidke ManguTuum1 klassis meeles ussi pea koht
		//Võimaldage käskudega liigutada
		//Kuvage küsimisel tulemus
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String rida=br.readLine();
			if(rida.length()>0){
				if(rida.charAt(0)=='v'){mt.vasakule();}
				if(rida.charAt(0)=='p'){mt.paremale();}
				if(rida.charAt(0)=='y'){mt.yles();}
				if(rida.charAt(0)=='a'){mt.alla();}
			}
		}
	}
}