public class Pruebas {
	
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
		cuentaHastaN(5);
		cuentaHastaN(-5);
	}
	
}
