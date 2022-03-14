public class LoendavLogija implements Logija{
	Logija sihtLogija;
	int loendur=0;
	public LoendavLogija(Logija logija){
		sihtLogija=logija;
	}
	public void logi(String teade){
		sihtLogija.logi(teade);
		loendur++;
	}
	public int logimisteArv(){return loendur;}
}