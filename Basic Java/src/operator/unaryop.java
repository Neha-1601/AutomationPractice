package operator;

public class unaryop {

	public static void main(String[] args) {
		int age=4;
		int id=++age;// pre
		int fee=--age;
		int wee=age++; // post
		int go=age--;
		System.out.println(age);  //4  ---5--4
        System.out.println(id);  //5---5
        System.out.println(fee);  //4---4
        System.out.println(wee); //4 bt after tht when we use age value then this value+1 in i.e. show in line no 10--4
	                          //first store value in var then increment
        System.out.println(go);//5 bt after ,age=4
}
}