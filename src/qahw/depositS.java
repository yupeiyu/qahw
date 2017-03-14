package qahw;

import java.text.DecimalFormat;

public class depositS {
	// 年利率0.0084, 一個月本利和多少？ 本金24萬
	
	private final static double rate=0.0084;//利息
	
	public static void main(String[] args){
		double principal=24_0000; //本金
		double money=getValue(rate,principal); //公式方法
		System.out.println(money);
		money=getValue(rate, principal);
	//處理小數點
		System.out.println(new DecimalFormat("0.00").format(money));
/*冗長版
 * DecimalFormat formatter=new DecimalFormat("0.00");
 * String strMoney=formatter.format(money);
 * System.out.println(strMoney);
 * */
	}

private static double getValue(double rate, double principal){
	return principal*(1+rate/12); //本利和公式 方法 有回傳值double
}
}