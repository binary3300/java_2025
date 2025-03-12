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
		//♡♥♡
		//♡♡♥
		/* 00 01 02
		 * 10 11 12
		 * 20 21 22
		 * ch? 0:
		 * (왼쪽이 0이다 그리고 오른쪽이 0이다){}
		 * */
		String data2 = "♡";
		for(int ch=0; ch<3; ch++) {
			for(int kan=0; kan<3; kan++) {
				if(ch==0 && kan==0){data2 = "♥";}
				else if(ch==1 && kan==1){data2 = "♥";}
				else if(ch==2 && kan==2) {data2 = "♥";}
				else {data2 = "♡";};
				System.out.print(data2);
			}System.out.println();
		}
		
		
		
		System.out.println("------13번------");
		//♡♡♥ 00 01 '02'
		//♡♥♡ 10 '11' 12
		//♥♡♡ '20' 21 22
		String data3 = "♡";
		String data4 = "♥";
		
		for(int ch=0; ch<3; ch++) {for(int kan=0; kan<3; kan++) {
			if(ch==0&&kan==2) {System.out.print("♥");}
			else if(ch==1&&kan==1) {System.out.print("♥");}
			else if(ch==2&&kan==0) {System.out.print("♥");}
			else {System.out.print("♡");}
			}System.out.println();}
		
//		for(int i=0; i<=2; i++) {i;}
//		for(int j=2; j>=0; j--) {j;}
		//이걸 원한게 아닌거같은데,,,,
		
		
//		for(int ch=0; ch<3; ch++) {
//			for(int kan=0; kan<3; kan++) {
//				if(for(int i=0; i<3; i++) {i 여기서잠시포기}){data3 = "♥";}
//				else if(ch==1 && kan==1){data3 = "♥";}
//				else if(ch==2 && kan==2) {data3 = "♥";}
//				else {data3 = "♡";};
//				System.out.print(data3);
//			}System.out.println();
//		}
		
		
		
		System.out.println("------14번------");
		/*	★
			2*1=2   3*1=3   4*1=4       
			2*2=4   3*2=6   4*2=8       
			2*3=6   3*3=9   4*3=12
		 */
//		출력 ( j + "*"+ i +"="+ j*i  +  "\t"  +  k +"*"+ i +"="+ k*i     +"\t"+    l +"*"+ i +"="+ l*i)
//		for(int i=1; i<4; i++) {System.out.print(i);}
//		for(int j=2; j<5; j++) {System.out.print(j);}
//		System.out.println();
//		System.out.println();
//		
		
		for(int i=1; i<4; i++) {
			for(int j=2; j<5; j++) {
				System.out.printf( "%d*%d=%2d\t" ,j,i,j*i);
				}System.out.println();
			}
		
//		인터넷에서 긁어옷온 구구단예제 답
		//printf가 핵심이었다!!!!!
//		int i, j;
//		for( i=1; i<=9; i++)
//		{
//			for( j=2; j<=4; j++)
//			{
//				System.out.printf("%d * %d = %2d\t", j, i, j*i);
//			}
//
//			System.out.println();
//		}
		
		
		
		System.out.println("------15번------");
		/*	★
			2*1=2   3*1=3   4*1=4       
			2*2=4   3*2=6   4*2=8       
			2*3=6   3*3=9   4*3=12     
								  			       
			5*1=5   6*1=6   7*1=7       
			5*2=10  6*2=12 	7*2=14        
			5*3=15  6*3=18 	7*3=21
		*/
		int i , j;
		String data5 = "j * i = j*i";
		for(i=1; i<4; i++) {
			for(j=2; j<8; j++) {
				System.out.print(j +"*"+ i +"="+ j*i +"\t");
				} System.out.println(); j=5;
			}
		
		
		
		
	}//
}//
