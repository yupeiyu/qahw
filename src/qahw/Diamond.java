package hw;


import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入奇數,範圍為整數 3,5,7,9,....,21： ");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		 
		//上半部
		for (int i = 1; i <= (n+1)/2; i++) {//由第一行往下印，共印一半，遞增＋＋
		
			for (int j = (n+1)/2; j > i; j--) { //印出左半邊點點，隨行數增加++而遞減--
		        System.out.print("．");
		      }
		    for (int k = 1; k < i*2; k++) {//隨行數遞增++，星星遞增++
		        System.out.print("＊");
		      }
		    for (int j = (n+1)/2; j > i; j--) {//印出右半邊點點，隨行數增加++而遞減--
		        System.out.print("．");
		      }
		    	System.out.println(); //換行
		    	
		    }
		//下半部


		    for (int i = (n-1)/2; i > 0; i--) { //由中間往下印，印完，遞減--
		      for (int j = (n+1)/2; j > i; j--) {//印出左半邊點點，隨行數增減--而遞增++
		        System.out.print("．");
		      }
		      for (int k = 1; k < i*2; k++) { //隨行數遞減--，星星遞減--
		        System.out.print("＊");
		      }
		      for (int j = (n+1)/2; j > i; j--) {//印出右半邊點點，隨行數增減--而遞增++
			        System.out.print("．");
			      }
		      System.out.println();//換行
		    }
	}

	}
