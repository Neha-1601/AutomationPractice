package array;

public class MultiArray2 {
// i think single dimenstional array
	public static void main(String[] args) {
		//  declaring source array
    char[] neha= {'r','k','n','f','s','v','c','z','l'};
    // declaring destination array
    char[] nehalash	= new char[9];
    // 
		
	System.arraycopy(neha,2,nehalash,0,nehalash.length);	
	for(int i=0; i<nehalash.length; i++	) {
		System.out.println(nehalash[i]);
	}
	}

}
