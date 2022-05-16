package Constructor;

public class cons4 {
     int i=10;
	
	cons4(){
		System.out.println("execute cons4");
	}
	
	
	public static void main(String[] args) {
		System.out.println("program starts");
		cons4 rr=new cons4();
		System.out.println("i:"+rr.i);
		
		System.out.println("end");

	}

}
