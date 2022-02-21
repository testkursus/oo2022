public class Naide3{
	int kordaja;
	int eksemplariLoendur;
	static int klassiLoendur;
	public Naide3(int uusKordaja){
		kordaja=uusKordaja;
	}
	int korruta(int arv){
		eksemplariLoendur++;
		klassiLoendur++;
		return kordaja*arv;
	}
}