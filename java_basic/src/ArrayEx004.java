
public class ArrayEx004 {
/* 배열명 ch
 * 값 B a n a n a
 * ch배열에서 a의 갯수세기
 * */
	public static void main(String[]args) {
	char[] ch = {'B', 'a', 'n', 'a', 'n', 'a'};	
	int count = 0;
	
	for(int i=0; i<ch.length; i++) {if (ch[i] == 'a') count++ ;}
	System.out.println("해당 배열에서 a의 갯수는: "+ count);
	
	/* count ++;
	 * count +=1;
	 * 효과는 똑같다!
	 * */
	
	}//
}//
