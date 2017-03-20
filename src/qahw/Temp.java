package qahw;

import java.util.Scanner;

public class Temp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入攝氏溫度: ");
		Scanner sc = new Scanner(System.in);
		int cel = sc.nextInt();
		double f;
		f=cel/5*9+32;
		
		System.out.println("相當於華氏 "+f+" 度");
	}


}
