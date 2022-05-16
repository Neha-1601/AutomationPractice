package Constructor;

public class thisstate4 {
    int age;
    float fee;
    thisstate4(int age){
    	System.out.println("starts");
    	this.age=age;
    }
    thisstate4(int age,float fee){
    	this(age);  // this statement -- call const with para
    	this.fee=fee; // this keyword-- gives local varible to global var
    	System.out.println("ends");
    }
    
    void main() {
    	System.out.println(age+" "+fee);
    }
    
	public static void main(String[] args) {
	thisstate4 ll=new thisstate4(66);
	thisstate4 pp=new thisstate4(77,9999);
    ll.main();
    pp.main();
	}

}
