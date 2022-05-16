package array;

public class Array2 {
/// progrm to calculate avg of numbers 											`
	public static void main(String[] args) {
	 int[] num= {2, -4, 6, 7, 33, 0, -2, 99, 22, -77};
	 double sum=0;
	 double average;
// access all elements using for each loop add element in sum
	 for(int i:num) {
		sum=sum + i;  //or sum +=num 
	 }
//get the total no of elements
	 int arrayLength=num.length;
// calculate avg , convert avg from int to double
	 average=sum/arrayLength;
	 System.out.println("average="+average);
	 
    }
}

// total add = 186
//186/10=8.6