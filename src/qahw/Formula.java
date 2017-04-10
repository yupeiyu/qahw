package hw;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double x;
		double sum = 0;
		double ans ;
		System.out.println("請輸入x值");
		Scanner s = new Scanner(System.in);
		x=s.nextInt();
		System.out.println("請輸入n值");
		Scanner s2 = new Scanner(System.in);
		n=s2.nextInt();
		
		for(double j=n;j>=1;j--){
			ans=((x++)+1)/j;   //子數 可視為x遞增+1 
			//System.out.println(ans); 檢查個別分數是否正確
			sum+=ans;//總和
			
		}
		
		
		System.out.println("Sum = "+sum);//印出最後的值
		
	}

}
