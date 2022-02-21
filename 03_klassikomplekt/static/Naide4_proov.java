public class Naide4_proov{
	public static void main(String[] arg){
		Naide4 a=new Naide4(2);
		Naide4 b=new Naide4(3);
		System.out.println(a.korruta(7));
		System.out.println(a.korruta(8));
		System.out.println(b.korruta(9));
		System.out.println(a.mituKordaEksemplarisKaivitatud());
		System.out.println(b.mituKordaEksemplarisKaivitatud());
		System.out.println(Naide4.mituKordaKlassisKaivitatud());
		System.out.println(Naide4.korruta(8, 7));
		//System.out.println(a.klassiLoendur);
		//System.out.println(b.klassiLoendur);
		//System.out.println(Naide3.eksemplariLoendur);
		
	}
}