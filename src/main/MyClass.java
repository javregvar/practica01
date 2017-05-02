public class Pruebas {

	public static boolean cuentaHastaN(int N) throws Exception{
		boolean res;
		if(N>0){
			res=true;
		}
		for(int i=1;i<=N;i++){
			System.out.println(i);
		}
		return res;
	}
	
	public static void main(String[] args){
		try{
			boolean res;
			int n = 5;
			res=cuentaHastaN(n);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
