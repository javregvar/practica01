public class MyClass{
  public MyClass(){};
  
  public void muestraMensaje(String msg){
    System.out.println(msg);
  }
  
  public String devuelveMensaje(){
    return "HELLO JAVI";
  }
  
  public int suma(int a, int b){
    return a+b;
  }
  
  public boolean devuelveExcepcion() throws IndexOutOfBoundsException{
    throw new IndexOutOfBoundsException();  
  }
}
