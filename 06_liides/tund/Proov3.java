public class Proov3{
	public static void main(String[] arg){
		Logija failiLogija=new FailiLogija2("logid2.txt");
		LoendavLogija loendavLogija1=new LoendavLogija(failiLogija);
		Logija prooviLogija=loendavLogija1;
		prooviLogija.logi("algus");
		if(arg.length==2){
			System.out.println(
			  Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));			  
		}
		prooviLogija.logi("ots");
		System.out.println(loendavLogija1.logimisteArv());
	}
}