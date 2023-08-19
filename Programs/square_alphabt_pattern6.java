package PatternPrograms;

public class square_alphabt_pattern6 {
	public static void main(String args[]) {
		
//		A A A A A
//		B B B B B
//		C C C C C
//		D D D D D
//		E E E E E
		
//		  ASCII VALUE OF  (A =65)
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
	}

}
