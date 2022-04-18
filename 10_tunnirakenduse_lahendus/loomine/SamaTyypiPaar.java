import java.util.*;
public class SamaTyypiPaar<Tyybinimi extends Comparable<Tyybinimi> > 
                      implements Comparable< SamaTyypiPaar<Tyybinimi> >{
	public Tyybinimi esimene;
	public Tyybinimi teine;
	
	@Override
	public int compareTo(SamaTyypiPaar<Tyybinimi> vorreldav){
		int vahe1=esimene.compareTo(vorreldav.esimene);
		if(vahe1!=0){return vahe1;}
		return teine.compareTo(vorreldav.teine);
	}
	
	@Override
	public String toString(){
		return "("+esimene+"; "+teine+")";
	}
}