package PatternPrograms;

public class square_alpha_patttern7 {
	public static void main(String args[]) {
		
		
//		E D C B A
//		E D C B A
//		E D C B A
//		E D C B A
//		E D C B A
		
		int n =5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(70-j));
			}
			System.out.println();
		}
	}

}
