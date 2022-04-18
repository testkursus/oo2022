import java.util.*;
public class PaarideLoendur1<T extends Comparable<T> >{
	Map<SamaTyypiPaar<T>, Integer> loendur=new TreeMap<>();
	T eelmine=null;
	void lisa(T element){
	   if(eelmine!=null){
		   SamaTyypiPaar<T> uus=new SamaTyypiPaar<>();
		   uus.esimene=eelmine;
		   uus.teine=element;
		   if(loendur.containsKey(uus)){
			   loendur.put(uus, loendur.get(uus)+1);
		   } else {
			   loendur.put(uus, 1);
		   }
	   }
	   eelmine=element;
	}
}