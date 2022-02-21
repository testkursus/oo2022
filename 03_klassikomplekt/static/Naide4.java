public class Naide4{
	private int kordaja;
	private int eksemplariLoendur=0;
	private static int klassiLoendur=0;
	public Naide4(int uusKordaja){
		kordaja=uusKordaja;
	}
	int korruta(int arv){
		eksemplariLoendur++;
		klassiLoendur++;
		return kordaja*arv;
	}
	int mituKordaEksemplarisKaivitatud(){
		return eksemplariLoendur;
	}
	static int mituKordaKlassisKaivitatud(){
		//eksemplariLoendur++;
		return klassiLoendur;
	}
	static int korruta(int arv, int millega){
		klassiLoendur++;
		return arv*millega;
	}
}