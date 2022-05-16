package casting;

public class primativecasting {

	public static void main(String[] args) {
		// TODO Aut
		int age=67;
	double salary=age; //widening type casting(lower to higher)-->implicit tht means when java complier writes be half of u-->double salary=(double)age
		
	double d=(double)age; // widening type casting-->explicit conversion
	System.out.println(age);	
	System.out.println(salary);	
	System.out.println(d);	
	 
	double fees=33d; // aslo wriiten as 33 only;
    int rollno=(int)fees;  // narrowing type casting--> only explicit done in tht
	long chr=(long)fees;   // narrowing i.e. higher to lower--expli
	float f1=(float)fees;//narrow--expli
	
	System.out.println("actuall fees:"+fees);
	System.out.println("roll no:"+rollno);
	System.out.println("chr:"+chr);
	System.out.println("F1:"+f1);
	}

}
