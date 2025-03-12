package Supplement1;
public class doubleFor06_10 {
public static void main(String[] args) {
	System.out.println("------6번------");
	//6
//	333
//	22
//	1
	int data = 3;
	for(int ch=0; ch<3; ch++) {
		for(int kan=3-ch; kan>0; kan+=(-1)) {
			System.out.print(data);
		} data+=(-1); System.out.println();
	}//코파일럿한테 물어봤음. int kan=3-ch;는 생각도 못했다.
	
	
	/*데이터 라는 변수가 있음.
	 * for(내 안에 있는 for문을 아래로 하나씩 늘리고 3이되면 끝) {
	 * for(3개부터 출력하기 시작해서 하나씩 줄어들음) {
	 * 뭘 출력하냐면 data!! 콘솔에 출력하면서 보여줄게} 
	 * data에서 값을 1씩 줄여; 그리고 띄어쓰기;}
	 */
	
	System.out.println("------7번------");
	//7
//	abc
//	abc
//	abc
//	char data2 = 'a';
//	for(int ch=1; ch<=3;ch++) {
//		for(int kan=1; kan<4; kan++) {
//			System.out.print(data2);
//			} data2 += 1; System.out.println();
//		}
	char data3 = 'a';
	for(int ch=1; ch<4; ch++) {
		for(int kan=1; kan<4; kan++) {
			System.out.print(data3);
			data3 +=1;
		} data3 = 'a'; System.out.println();
	}
	
	System.out.println("------8번------");
	//8
//	a
//	ab
//	abc
	char data4 = 'a';
	for(int ch=2; ch<5; ch++) {
		for(int kan=1; kan<=ch-1; kan++) {
			System.out.print(data4);
			data4 +=1;
		}  data4= 'a';System.out.println();
	}
	
	System.out.println("------9번------");
	//9
//	abc
//	ab
//	a kan=3-ch; kan>0; kan+=(-1)
	char data5 = 'a';
	for(int ch=0; ch<3; ch++) {
		for(int kan=3-ch; kan>0; kan+=(-1)) {
		System.out.print(data5);
		data5 +=1;
		}data5 = 'a'; System.out.println();
	}
	
	
	System.out.println("------10번------");
	//10
//	1
//	33
//	555
	
	/*
	 *아래로
	 *1씩
	 *늘어날거야
	 *3줄이 되면 멈출거야
	 *
	 * 옆으로
	 * 1개로 시작해서
	 * 3개까지 늘면
	 * 느는걸 멈출거야
	 * 
	 * 데이터에는 1이 있을거야
	 * 한바퀴 끝나면 2씩 더할거야.
	 */
	int data6 = 1;
	for(int ch=0; ch<3; ch++) {
		for(int kan=3-ch; kan<=3; kan++) {
		System.out.print(data6);
		}data6+=2; System.out.println();
	}
	
	}//
}//
