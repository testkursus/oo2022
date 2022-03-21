package pr1;

public class JaagupiTuum implements ManguTuum{
	int[][] kohad={{0, 0}};
	int suund=0; //0-paremale, 1-yles, 2-vasakule, 3-alla
	public void vasakule(){}	
	public void paremale(){suund=0;}	
	public void yles(){}	
	public void alla(){}	
	public void samm(){
		if(suund==0){kohad[0][0]++;}
	}
	public int[][] ussiKohad(){
		return kohad;
	}
	public int[] ounaKoht(){return null;}
	public void ounaleJuhuslikKoht(){}
}