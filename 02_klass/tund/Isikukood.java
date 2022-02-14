public class Isikukood{
	private String kood;
	public Isikukood(String uusKood){kood=uusKood;}
	public String sugu(){
		return (Integer.parseInt(kood.substring(0, 1)) % 2 == 0 ? 
		        "naine" : "mees");
	}
	public String aastakakstahte(){
		//if(kood.substring(0, 1).equals("1")){return "18";}
		return String.valueOf(18+
		   (Integer.parseInt(kood.substring(0, 1))-1)/2);		
	}
	public String synniaasta(){
		return aastakakstahte()+kood.substring(1, 3);
	}
}