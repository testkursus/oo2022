public class Proov2{
	public static void main(String[] arg){
		Mangija m1=new Mangija("Tamm", 7, 12, 30, 3.5);
		Mangija m2=new Mangija("Kask", 17, 12, 150, 3.5);
		Meeskond punased=new Meeskond("Kassid");
		punased.lisaMangija(m1);
		punased.lisaMangija(m2);
		System.out.println(punased);
		punased.liigu(3);
		System.out.println(punased);
	}
}