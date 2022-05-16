package polymorphism;

public class compiletimepoly {
	/**
	 * When a method gets to know its implementation at the time of compilation is known as compile time poly
	 * this can be achieved by using static method overloading
	 */
 static void sum(int a, int b) {
	 int res=a+b;
	 System.out.println("add of this no:"+res);
 }
static void sum(int a, int b, int c) {
	int res=a+b+c;
	System.out.println("add of this no:"+res);
}
	
public static void main(String[] args) {
	// 
    compiletimepoly.sum(77, 99, 66);  // call static method with parameter filled in tht
	
}

}