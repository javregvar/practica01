public class Pruebas {

	public static void cuentaHastaN(int N) throws Exception{
		for(int i=1;i<=N;i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		try{
			int n = 5;
			cuentaHastaN(n);
			cuentaHasta10();
			
			n=-5;
			cuentaHastaN(n);
		}catch(Exception e){
			
		}
	}
}
