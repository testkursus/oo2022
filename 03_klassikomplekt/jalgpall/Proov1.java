public class Proov1{
	public static void main(String[] arg){
		Mangija m1=new Mangija("Tamm", 7, 12, 30, 3.5);
		System.out.println(m1);
		System.out.println(m1.kaugus(10, 12));
		System.out.println(m1.kaugus(10, 16));
		m1.liigu(1);
		System.out.println(m1);
	}
}