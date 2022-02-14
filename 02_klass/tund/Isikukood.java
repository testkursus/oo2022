public class Isikukood{
	private String kood;
	public Isikukood(String uusKood){kood=uusKood;}
	public String sugu(){
		return (Integer.parseInt(kood.substring(0, 1)) % 2 == 0 ? 
		        "naine" : "mees");
	}
}