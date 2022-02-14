public class Kilpkonn{
	private int x, y, suund;
	@Override
	public String toString(){
		return "Kilpkonn ("+x+", "+y+", suund "+suund+")";
	}
	public int kysiX(){return x;}
	public int kysiY(){return y;}
	public void edasi(){
	  if(suund==0){x++;}
	  if(suund==1){y++;}
	  if(suund==2){x--;}
	  if(suund==3){y--;}
	}
	//Lisa funktsioon keera(), mis suurendab suunda ühe võrra
	//Kui ring on täis, alustatakse taas suunast 0
	public void keera(){
		if(suund<3){suund++;}
		else{suund=0;}
	}
}
//tehke prooviklass. Looge kilp