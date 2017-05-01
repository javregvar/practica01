public class Pruebas {

	public static void cuentaHasta10(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
	
	public static void cuentaHastaN(int N){
		if(N>0){
			//Si es positivo
			for(int i=1;i<=N;i++){
				System.out.println(i);
			}
		}else{
			//Si es negativo
			System.out.println("El número introducido es negativo o cero.");
		}
	}
	
	public static void main(String[] args){
		int n = 5;
		cuentaHastaN(n);
		cuentaHasta10();
		
		n=-5;
		cuentaHastaN(n);
	}
	
}
