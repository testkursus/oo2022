import java.util.*;
public class Meeskond{
	List<Mangija> mangijad=new ArrayList<Mangija>();
	String nimetus;
	public Meeskond(String uusNimetus){nimetus=uusNimetus;}
	public void lisaMangija(Mangija m){mangijad.add(m);}
	public String toString(){
  	  StringBuffer sb=new StringBuffer();
	  sb.append(nimetus+"\n");
	  for(Mangija m:mangijad){
		  sb.append(m+"\n");
	  }
	  return sb.toString();
	}
	public void liigu(double sek){
		for(Mangija m: mangijad){
			m.liigu(sek);
		}
	}
}
//Looge prooviprogramm meeskonna ja kahe mängijaga selles
//Kuvage mängijate andmed praegu
// ja kahe sekundi pärast.