import java.util.*;
public class HargnevLogija implements Logija{
	List<Logija> puhver=new ArrayList<Logija>();
	public void lisaLogija(Logija lg){puhver.add(lg);}
	public void logi(String teade){
		for(Logija abi: puhver){
			abi.logi(teade);
		}
	}
}