package hw;

public class Ninenine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//橫的印，一行印完，換行
		
		for(int j=1;j<=9;j++){
			for(int i=1;i<=9;i++){
				int sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t"); // \t=空格 給我去旁邊一點
				//同一行
			}
			System.out.println( );//換行
		}
	}

}
