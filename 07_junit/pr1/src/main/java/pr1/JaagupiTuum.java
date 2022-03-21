package pr1;

public class JaagupiTuum implements ManguTuum{
	int[][] kohad={{0, 0}};
	int suund=0; //0-paremale, 1-yles, 2-vasakule, 3-alla
	public void vasakule(){suund=2;}	
	public void paremale(){suund=0;}	
	public void yles(){suund=1;}	
	public void alla(){suund=3;}	
	public void samm(){
		if(suund==0){kohad[0][0]++;}
		if(suund==1){kohad[0][1]++;}
		if(suund==2){kohad[0][0]--;}
		if(suund==3){kohad[0][1]--;}
	}
	public int[][] ussiKohad(){
		return kohad;
	}
	public int[] ounaKoht(){return null;}
	public void ounaleJuhuslikKoht(){}
}