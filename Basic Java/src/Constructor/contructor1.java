package Constructor;

public class contructor1 {
     int roll;
     double salary;
   contructor1(int r,double s){  
	   roll=r;
	   salary=s;
   }
   void display() {
	   System.out.println(roll+" "+salary);


   }
 
  
	   public static void main(String[] args) {
	   contructor1 c1=new contructor1(101,24567.89);
	   c1.display();
	   
	   contructor1 c2=new contructor1(000,77777.89);
	   c2.display();
	
	
	
}
}