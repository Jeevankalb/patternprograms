package PatternPrograms;

public class Square_num_pattern2 {
	

	
		public static void main(String args[]) {
		
			
//			O/P:
//			10101
//			10101
//			10101
//			10101
//			10101
			
			int n =5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(j%2==0) {
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
					
				}
				System.out.println();
			}
		}
}
