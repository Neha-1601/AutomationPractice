package Constructor;

public class cons3 {
     int roll;
     double salary;
  
  void display() {
	 System.out.println(roll+" "+salary); 
  }
  cons3(int j){
	  System.out.println("hello");
	  
  }
  public static void main(String[] args) {
      
       cons3 tt=new cons3(88);
        tt.display();
	}

}
