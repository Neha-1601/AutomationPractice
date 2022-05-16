package casting;
class mayur{
	void test1() {
		System.out.println("start test 1");
	}
}

class neha extends mayur{
	 void test2() {
		 System.out.println("starts test2");
	 }
}
class ritesh extends neha{
	void test3() {
		System.out.println("starts test3");
	}
}
public class upcasting2 {
public static void main(String[] args) {
		// upcasting..........
      neha n=new ritesh();  // 
      n.test1();
      n.test2();
      
      ritesh p=new ritesh();
      neha n1=p;    //implicit casting
      neha n2=(neha)new ritesh();  // explicit casting
	  //or
      neha n3=(neha)p;  // explicit casting
	  n2.test1();
	  n2.test2();
	 
	  mayur m1=new neha();   // implicit upcasting
	  mayur m2=new ritesh();  // implicit upcasting
	  
	 ritesh p2=new ritesh();
	 mayur m3=p2;  // implicit upcasting
	 mayur m4=(mayur)p2;   // explicit
	 mayur m5=(mayur)new ritesh();   //explicit
	 
	 System.out.println("progrm ends");
       
	
	
	
	
	
	
	
	
	
	}

}
