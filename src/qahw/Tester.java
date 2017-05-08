package oo;

public class Tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a={56,87,98,54,66};
		 double[] b={5.8,9.6,5.5,8.8};
		 String [] s={"b","g","h","j","d","k"};
		
		Sort ss =new Sort();
		ss.bubbleSort(a);
		ss.print(a);
		
		ss.bubbleSort(b);
		ss.print(b);
	
		ss.bubbleSort(s);
		ss.print(s);
	}

}
