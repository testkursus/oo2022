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
	List<Map.Entry<SamaTyypiPaar<T>, Integer> > jarjestatud(){
		List<Map.Entry<SamaTyypiPaar<T>, Integer> > abi=
		   new ArrayList<>(loendur.entrySet());
		Collections.sort(abi, new Comparator<Map.Entry<SamaTyypiPaar<T>, Integer> >(){
			public int compare(Map.Entry<SamaTyypiPaar<T>, Integer> vorreldav1, 
			                     Map.Entry<SamaTyypiPaar<T>, Integer> vorreldav2){
				return vorreldav2.getValue()-vorreldav1.getValue();
			}
		});
		return abi;
	}
}