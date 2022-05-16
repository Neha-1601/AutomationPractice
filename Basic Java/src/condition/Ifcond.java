package condition;

public class Ifcond {

	public static void main(String[] args) {
		// defining variable
		int num1=66,num2=44;
	if(!(num1==num2)) {  // here logical not its gives reverse value of operands..
        System.out.println("num2 is greater than num2");// here if condn is exicute when its cond is true 
	} 
	else {
		System.out.println("num1 is smaller than num2");//this block excute when if condn is false
	}
	
	if (num1>num2) {
		System.out.println("num1 is greater");
	}
	else {
		System.out.println("num1 is smaller");
	}
	if(num1<num2) {  //this is false
		System.out.println("num1 is greater");
	}
	else { // for tht exicute tht block
		System.out.println("num2 is smaller");
	}
	if ((num1==num2)||(num1>num2)) {  // in logical or|| any one codn is true then exicute tht block
		System.out.println("num1 is either equal to num2 or greter than num2");
	}
	else {
		System.out.println("num1 smaller than num2");
	}
	if(num1>=num2 && num1>num2) {
		System.out.println("num1 is either greater n equals to num2 or greater thn num2");
	}
	else {
		System.out.println("num1 is smaller thn num2");
	}
	int sub1=50,sub2=30;
	if(sub1>35 && sub2>35) {
		System.out.println("pass...");
	}
	else {
		System.out.println("fail...");
	}
}
}