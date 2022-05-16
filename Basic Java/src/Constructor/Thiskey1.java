package Constructor;

public class Thiskey1 {
  int x;
    Thiskey1(int x){
    	//System.out.println("LV x:"+this.x); //0
    	this.x=x; //x=11
 //  System.out.println("x:"+x);//when we access lv value then its access in tht method where we declared tht.. not in main method always remeber
  // System.out.println("LV x:"+this.x);  //11
  // System.out.println("x:"+x); //11
    }
  
  
	public static void main(String[] args) {
		Thiskey1 kk=new Thiskey1(11);
		System.out.println("gives the lv value to gv:"+kk.x); //11
	}

}
