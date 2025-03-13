package com.company.java018;

public class JAVA_IO006_String_StringBuffer {
	public static void main(String[] args) {
		//1. String 문자열 누적  값이 누적되면서 주소도 자꾸 바뀐다. 매번 새로 만들어서 다른곳에 저장한다는뜻! heap area 터져요!!!
		String str = "ABC"; //1. str주소 >>798154996
		System.out.println("1. str주소 >>" + str + "  "+ System.identityHashCode(str));
	
		str += "D";		    //2. str주소 >>424058530
		System.out.println("2. str주소 >>" + str + "  "+ System.identityHashCode(str));
		
		
		//2. StringBuffer 문자열 누적  어머놀라워라 값이 누적되는데 주소가 그대로~!
		StringBuffer sb = new StringBuffer();
		sb.append("ABC"); //3. sb주소 >>ABC  1044036744
		System.out.println("3. sb주소 >>" + sb + "  "+ System.identityHashCode(sb));
		sb.append("D");   //4. sb주소 >>ABCD  1044036744
		System.out.println("4. sb주소 >>" + sb + "  "+ System.identityHashCode(sb));
		
		
		
	}
}
