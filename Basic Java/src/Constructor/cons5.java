package Constructor;

public class cons5 {
   double d=33.3;
   
    cons5(){  
    System.out.println("cons execute"); 	
    	d=44;   //
    }
    
   public static void main(String[] args) {
		// TODO Auto-generated method stub
    cons5 ref= new cons5();
    System.out.println("d:"+ ref.d);
    System.out.println("---------------");
    
    cons5 neha=new cons5();
    System.out.println("d :"+neha.d);
	}

}
