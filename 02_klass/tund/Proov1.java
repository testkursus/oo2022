public class Proov1{
	public static void main(String[] arg){
		Isikukood jaagup=new Isikukood("37605030299");
		Isikukood paula=new Isikukood("61009171032");
		System.out.println(paula.synniaasta());
		System.out.println(jaagup.sugu());
		System.out.println(paula.sugu());
	}
}