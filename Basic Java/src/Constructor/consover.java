package Constructor;

public class consover { 
	int i;
	double d;
	// cons overloading with diff set of paramater
	consover(){
		System.out.println("starts");
	}
	
	consover(int a){
		System.out.println("execute cons int:");
		i=a;
	}
	
	consover(double b){
		System.out.println("execute cons double");
		d=b;
	}
	consover(int a, double b){
		System.out.println("execute con int double");
		i=a;
		d=b;
	}
   void println() {
	   System.out.println("i:"+i);
	   System.out.println("d:"+d);
   }
	public static void main(String[] args) {
	 consover mm=new consover();
	 System.out.println("no paramrt:"+mm.i);
	 System.out.println("-------------------");
	 consover nn=new consover(11);
     nn.println();
	 System.out.println("-----------------------");  
	 consover jj=new consover(88.8);
	 jj.println();
	 System.out.println("--------------------------------");
	 consover kk=new consover(99,5555.8);
	 kk.println();
	}

}
