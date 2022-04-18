import java.util.*;
public class Proov1{
	public static void main(String[] arg){
//		List<String> eesnimed=new ArrayList<String>();
		List<String> eesnimed=new LinkedList<>();
		eesnimed.add("Juku");
		eesnimed.add("Kati");
		eesnimed.add("Mati");
		eesnimed.add("Juku");
		System.out.println(eesnimed);
		eesnimed.add(1, "Juhan");
		System.out.println(eesnimed);
		System.out.println(eesnimed.get(0));
		for(String eesnimi: eesnimed){
			System.out.println(eesnimi);
		}
		Iterator<String> it=eesnimed.iterator();
		while(it.hasNext()){
			String eesnimi=it.next();
			System.out.println(eesnimi);
		}
		Set<String> nimehulk=new HashSet<>(eesnimed);
		System.out.println(nimehulk);
		String[] eesnimemassiiv=nimehulk.toArray(new String[]{});
		System.out.println(eesnimemassiiv[0]);
		System.out.println(Arrays.toString(eesnimemassiiv));
		int jukuKoht=eesnimed.indexOf("Juku");
		if(jukuKoht>=0){System.out.println("Juku kohal "+jukuKoht);}
		else{System.out.println("Juku puudub");}
	}
}