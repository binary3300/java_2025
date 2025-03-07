package Supplement1;
public class doubleFor01 {
	public static void main(String[] args) {
		/* 1) 이중for
		 * ★★★
		 * ★★★
		 * ★★★
		 * for(string? i=★★★;i<4;i++){프린트i}
		 */
		//for(String i="★★★"; i=<3; i++) {System.out.println(i);}
		//별 세개짜리는 =<3 i++ 이걸 할 수가 없구나,,, 그럼 i="★" 로 해서 (ck 줄){(kan){★★★}} 해야겠ㄷ네
		
		String data = "★";
		for(int ch=1;ch<=3;ch++) {for(int kan=1; kan<=3; kan++) {System.out.print(data);}System.out.println();}
		
		
		/* 2) 이중for
		 * ★
		 * ★★
		 * ★★★
		 * 가로로는 늘지않고 한바퀴 돌았을때 별이 하나씩 늘게...
		 */
		//String data = "★";
		for(int ch=1;ch<=3;ch++) {//3 아래로 반복출력합니다. 3번 반복하면 끝납니다.
			for(int kan=1; kan<=1; kan++) { //2 오른쪽으로 반복출력합니다. 1번 반복하면 끝입니다.
				System.out.println(data); //1 data"★"을 출력합니다
			}data+="★";
		}
		
		/* 3) 이중for
		 * ★★★      ★를 출력 ★를 출력 ★를 출력
		 * ★★		★를 출력 ★를 출력
		 * ★		★를 출력
		 */
		String data2 = "★";
		for(int ch=1; ch<=3; ch++) {for(int kan=3; kan>=1; kan--) {System.out.println(data2);}}
		
		
		
		
	}//main
}//claa
