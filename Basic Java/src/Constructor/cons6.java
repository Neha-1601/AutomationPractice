package Constructor;

public class cons6 {
    double d=2.5;
    cons6(double a){
    	System.out.println(" parametraiced const");
    	d=a;
    }
    
	public static void main(String[] args) {
		cons6 rr=new cons6(66.8);
		System.out.println("d:"+rr.d); //d=66.8
		cons6 nn=new cons6(77);
        System.out.println("d:"+nn.d);  // d=77.7
	}

}
