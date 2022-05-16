package array;

public class Array0 {

	public static void main(String[] args) {
		// declare array in duff ways..
	//	String[] chocalate;    // declared
	//	chocalate=new String[3];  // instantiation or allocate memory
		   //or
	//	String[] chocalate=new String[3];
		
	//	chocalate[0]="kitkat";
	//	chocalate[1]="5star";
	//	chocalate[2]="perk";
		  
		//or   syntax for   DECLRATION, INSTANTIATION,INITIALIZATION....
		String[]  chocalate= {"kitkat","5star","perk"};
		
		System.out.println(chocalate[0]);
		chocalate[0]="dairymilk";   // change an array element
		System.out.println(chocalate[0]);
		System.out.println(chocalate.length);
		System.out.println("________normal for loop___________");
  // iterate array elements using loop		
		for(int i=0; i<chocalate.length; i++) {
        System.out.println(chocalate[i]);
	    }
        System.out.println("________-using for each loop_________-");
  //iterate array elements using for each loop      
       for(String i:chocalate) {   // for each loop, for(LHS=RHS){
    	 System.out.println(i);    //                                  }  
       }                           // LHS should be same as RHS type in farm of datatype or class

}
}