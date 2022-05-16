package Methods;

public class Method1 {

	/*
	 * accessmodifier: Private
	 * non-accessmodifier: static
	 * return type:int
	 * methodName:getEmpName
	 * argument/t:inturn  id
	 * return value:return id
	 */
	private static int getEmpName(int id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier:  Public
	 * non-accessmodifier:  Static
	 * return type:  int
	 * methodName:  getEmpContact
	 * argument/parameter: short id 
	 * return value: return id
	 */
	public static int getEmpContact(short id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier: Default
	 * non-accessmodifier: Static
	 * return type:  double
	 * methodName:   getEmopin
	 * argument/parameter:  long id
	 * return value: return id
	 */
	static protected double getEmpPin(long id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier: default
	 * non-accessmodifier: static
	 * return type: int
	 * methodName: getEmpAccount
	 * argument/parameter: 
	 * return value: return 25
	 */
	static int getEmpAccount() {
		//statement
		return 25;
	}
	/*
	 * accessmodifier: public
	 * non-accessmodifier: static
	 * return type: void
	 * methodName: main
	 * argument/parameter: string args
	 * return value: -
	 */
	public static void main(String[] args) {
		
		//return;//by default written by java compiler at the time of compilation
	}
	/*
	 * accessmodifier:  default
	 * non-accessmodifier : non static
	 * return type: void
	 * methodName: add two num
	 * argument/parameter: -
	 * return value:-
	 */
	void addTwoNumbers() {
		int num1=25,num2=50,res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
	}
	/*
	 * accessmodifier: private
	 * non-accessmodifier: non static
	 * return type: double
	 * methodName: add two num
	 * argument/parameter: int num1 int num2
	 * return value: retuen res
	 */
	private double addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
		return res;
	}
}
