package qahw;

import java.util.Scanner;

public class CarFee {
	
	static double fee=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("請輸入停車開始時間(點鐘)");
	Scanner sc1 =new Scanner(System.in);
	int starthr=sc1.nextInt();
	System.out.println("請輸入停車開始時間(分鐘)");
	Scanner sc2 =new Scanner(System.in);
	int startmin=sc2.nextInt();
	System.out.println("請輸入停車結束時間(點鐘)");
	Scanner sc3 =new Scanner(System.in);
	int endhr=sc3.nextInt();
	System.out.println("請輸入停車結束時間(分鐘)");
	Scanner sc4 =new Scanner(System.in);
	int endmin=sc4.nextInt();
	
	int halfhr =( (endhr*60+endmin)-(starthr*60+startmin))/30;
	//System.out.println(halfhr);
	
		if(halfhr<=1){
			fee=0;
			print();
		}else if(halfhr<=4&& halfhr>=1){
			fee=halfhr*30;
			print();
		}else if(4<halfhr&&halfhr<=8){
			fee=(halfhr-4)*40+4*30;
			print();
		}else {
			fee=(halfhr-8)*60+4*40+4*30;
			print();
		}
		
		}
	public static void print(){
		System.out.println("需繳費 "+fee+"元");
	}
	}
