public class ManguTuum1 implements ManguTuum{
	int ounX, ounY, peaX=0, peaY=0;
	final int laius=10, korgus=10;
	char suund='p';
	public void vasakule(){suund='v';}
	public void paremale(){suund='p';}
	public void yles(){suund='y';}
	public void alla(){suund='a';}
	public void samm(){
		if(suund=='v'){peaX--;}
		if(suund=='p'){peaX++;}
		if(suund=='y'){peaY++;}
		if(suund=='a'){peaY--;}		
	}
	public int[][] ussiKohad(){return new int[][]{{peaX, peaY}};}
	public int[] ounaKoht(){
		return new int[]{ounX, ounY};
	}
	public void ounaleJuhuslikKoht(){
		ounX=(int)(laius*Math.random());
		ounY=(int)(korgus*Math.random());
	}
}