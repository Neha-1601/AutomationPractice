package Constructor;

public class cons7 {
	/*{{int i=10;
	 
    cons7(){
    	System.out.println("program starts");
        i=112;
    	
    }
	

	public static void main(String[] args) {
		cons7 dd=new cons7();
		System.out.println("i:"+dd.i);  //112
		cons7 cc=new cons7();
		System.out.println("i"+cc.i);

	}

}  qurry?? i=10 he ks yeil o/p ?
	*/
	int i = 10;

	cons7() {
		System.out.println("Running Class B constructor..");
		//i = 23;
	}


	public static void main(String args[]) {
		System.out.println("Main() of Class Cons7 is started...");
		cons7 b1 = new cons7();
		System.out.println("Class B global varibale i = " + b1.i);
		System.out.println("======================================");
		cons7 b2 = new cons7();
		System.out.println("Class B global varibale i = " + b2.i);
		System.out.println("Main() of Class Cons7 is ends here...");
	}
}