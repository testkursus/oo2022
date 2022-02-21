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
	public Mangija lahim(double px, double py){
		//Eeldan, et, esimene mängija on lähim
		//Vaatan kõik mängijad läbi
		//Kui leian lähema mängija, määran tema lähimaks
		//Tagastan funktsioonist mängija
		Mangija v=mangijad.get(0);
		for(Mangija m: mangijad){
			if(m.kaugus(px, py)<v.kaugus(px, py)){
				v=m;
			}
		}
		return v;
	}
}
//Looge prooviprogramm meeskonna ja kahe mängijaga selles
//Kuvage mängijate andmed praegu
// ja kahe sekundi pärast.