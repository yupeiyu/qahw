package hw;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		＆＝兩個都要一樣才行，01=0

		|=只要有1就是1

		^ = 兩個一樣為0   11=0 ; 00=0 ; 10=1


		*/
		        int i = 13;
		        int j = 12;
		 
		        System.out.println("變數值...");
		        System.out.println(" i = " + i);
		        System.out.println(" j = " + j);
		 
		        System.out.println("位元運算...");
		        System.out.println(" i & j = " + (i & j));
		        System.out.println(" i | j = " + (i | j));
		        System.out.println(" i ^ j = " + (i ^ j));
		        System.out.println(" ~i = " + (~i));  //全部0改成1，變成原數值負數-1
		        System.out.println(" ~j = " + (~j));  //
		    }
		
	}


