public class Proov2b{
	public static void main(String[] arg){
		String juhis="kee";
		if(arg.length>0){juhis=arg[0];}
		Kilpkonn k1=new Kilpkonn();
		for(int i=0; i<juhis.length(); i++){
		  if(juhis.charAt(i)=='e'){k1.edasi();} else {k1.keera();}
		  System.out.println(k1);			
		}
		System.out.println(k1.kysiX());
	}
}
