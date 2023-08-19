package PatternPrograms;

public class triange_num_pattern14 {
	public static void main(String args[]) {
		
//		5
//		4 5
//		3 4 5 
//		2 3 4 5
//		1 2 3 4 5
		
		int n =5;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println( );
		}
//		System.out.println();
	}

}
