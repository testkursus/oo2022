class Naide1{
	static int loendur=0;
	static int korrutaKahega(int arv){
		loendur++;
		return arv*2;
	}
	public static void main(String[] arg){
		//System.out.println(loendur);
		System.out.println(Naide1.loendur);
		System.out.println(korrutaKahega(5));
		System.out.println(loendur);
		System.out.println(korrutaKahega(11));
		System.out.println(loendur);
		
	}
}