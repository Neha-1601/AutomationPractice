package Constructor;
 
public class cons2 {
	int age;  //gv  with no value
	double salary; //gv with no value therefore value is'0'
	  
	  cons2(){ // at the time of obj creation cond is used to inilize instance member of i.e.int=age
		  // default cons wriiten by java at time of compilation
	  
	  }
	
	  
  public static void main(String[] args) {
		cons2 nm=new cons2(); // obj creat--for tht obj we need const
		System.out.println(nm.age);    // o/p is zero
        	
	  }

}
