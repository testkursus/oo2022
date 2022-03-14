public class Proov2{
	public static void main(String[] arg){
		Logija esimene=new LihtneLogija();
		Logija teine=new FailiLogija2("logid2.txt");
		Logija kolmas=new FailiLogija2("logid/logid3.txt");
		//Lisage kolmas logija, mis saadab teated alamkataloogis olevasse faili
		//Kontrolli toimimist
		HargnevLogija yhendaja=new HargnevLogija();
		yhendaja.lisaLogija(esimene);
		yhendaja.lisaLogija(teine);
		yhendaja.lisaLogija(kolmas);
		Logija prooviLogija=yhendaja;
		prooviLogija.logi("algus");
		if(arg.length==2){
			System.out.println(
			  Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));			  
		}
		prooviLogija.logi("ots");
	}
}