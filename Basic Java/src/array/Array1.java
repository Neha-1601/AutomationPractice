package array;

public class Array1 {

	public static void main(String[] args) {
		// creat an array
     int[] age= {12, 34, 88, 99,2};
     System.out.println("1st element:"+age[0]);
     System.out.println("2nd element:"+age[1]);
     System.out.println("3rd element:"+age[2]);
     System.out.println("4th element:"+age[3]);
     System.out.println("5th element:"+age[4]);
     System.out.println("array size:"+age.length);
    for (int i:age) {
    	System.out.println("**"+i);
       if(i==2)	{
    	   System.out.println(i);
       break;
       } else {
    	   System.out.println("age is not 2");
       }
    }
    // above same bt herr use normal for loop
    for (int i=0; i<age.length; i++) {
    	System.out.println(age[i]);
     if(age[i]==2) {
    	 System.out.println(age[i]);
     break;
    } else {
    	System.out.println("age is not 2");
           }
    }	
 }
}