public class Proov3{
	public static void main(String[] arg){
		int[][] laud=new int[10][10];
		laud[2][3]=1;
		//Võtke eelmisest näitest teksti abil juhitav kilpkonn
		//Igasse tema teekonna punkti kirjutage 1
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print(laud[i][j]);
			}
			System.out.println();
		}
	}
}
