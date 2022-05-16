package Constructor;
class neha{
	 int rollno; // gv
	 float fee;
	 neha(int rollno,float fee){ // lv
		 System.out.println("local rollno:"+rollno); //12
		 System.out.println("local fee:"+fee); //677.0
		 System.out.println("intial global rollno:"+this.rollno);  // 0 bex here we not intialize the value gv
		 System.out.println("intial global fee:"+this.fee);// 0.0
		 //global variable=local variable
		 this.rollno=rollno; //12
		 this.fee=fee; // 677
		 System.out.println("after update,  global rollno:"+this.rollno); //12
		 System.out.println("after update,  global fee:"+this.fee); //677
	 }
	 void display() {
		 System.out.println(rollno+" "+fee); //12&677.0
	 }
}

public class Thiskey {

	public static void main(String[] args) {
	 neha mm=new neha(12,677f);
	 mm.display();
	 neha nn=new neha(55,890f); // here we update the value for tht we creat new obj
	 nn.display();

	}

}
