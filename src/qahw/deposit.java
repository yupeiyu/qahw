package qahw;

import java.text.DecimalFormat;

public class deposit {
	public static void main(String[]args){
		int month;
		int deposit = 240000;
		double amount;
		amount=deposit*(1+0.0084/12);
		DecimalFormat df=new DecimalFormat("0.00");
		String s=df.format(amount);   
		System.out.println(s);
		System.out.println("一個月本利和"+s);
		}
	}


