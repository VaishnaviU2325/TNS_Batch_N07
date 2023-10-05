package Array;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] arr1= {{2,4,6},{8,4,2}};
		for (int[]i: arr1){
			for (int j:i){
				sum = sum+j;
			}
		}
		System.out.println("sum=" +sum);
	}

}
