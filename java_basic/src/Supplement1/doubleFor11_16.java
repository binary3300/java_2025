package Supplement1;

//
public class doubleFor11_16 {
	public static void main(String[] args) {
		System.out.println("------11번------");
//		555
//		33
//		1
		int data = 5;
		for(int ch=0; ch<3; ch++) {
			for(int kan=3-ch; kan>0; kan--) {
				System.out.print(data);
			}data+=(-2); System.out.println();
		}
		
		
		System.out.println("------12번------");
		//♥♡♡
		//♡♥
		//♡♡♥
		/* 00 01 02
		 * 10 11 12
		 * 20 21 22
		 * */
		String data2 = "♥";
		for(int ch=0; ch<3; ch++) {
			for(int kan=0; kan<3; kan++) {
				if(ch==0 && kan==0){data2 = "♡";}
				else if(ch==1 && kan==1){data2 = "♡";}
				else if(ch==2 && kan==2) {data2 = "♡";}
			
				System.out.print(data2);
			}System.out.println();
		}
		
		
		
		System.out.println("------13번------");
		//♡♡♥
		//♡♥♡
		//♥♡♡
		
		
		System.out.println("------14번------");
		/*	★
			2*1=2   3*1=3   4*1=4       
			2*2=4   3*2=6   4*2=8       
			2*3=6   3*3=9   4*3=12
		 */
		
		
		System.out.println("------15번------");
		/*	★
			2*1=2   3*1=3   4*1=4       
			2*2=4   3*2=6   4*2=8       
			2*3=6   3*3=9   4*3=12     
								  			       
			5*1=5   6*1=6   7*1=7       
			5*2=10  6*2=12 	7*2=14        
			5*3=15  6*3=18 	7*3=21
		*/
		
		
		
		
		
	}//
}//
