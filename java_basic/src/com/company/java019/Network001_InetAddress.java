package com.company.java019;

import java.net.InetAddress;
import java.net.UnknownHostException;

//메인클래스
public class Network001_InetAddress {
	public static void main(String[] args) {
		//#1
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("1. ip hostName : " + local.getHostName()); 
			System.out.println("2. ip hostAddress : " + local.getHostAddress());
//			1. ip host name : DESKTOP-O2QVH9P
//			2. ip host Address : 192.168.40.82

			InetAddress.getByName("www.naver.com");
			System.out.println("3. Naver: " + local);
			
			
			}catch(UnknownHostException e) { e.printStackTrace();}
		
		
	}//메인
}//클래스
