package junit;

public class SortingTester {
//自己寫的測試
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting s=new Sorting();
		int a[]={5,2,4,3,1};
		int result[]=s.exchangeSort(a,false);
		  for(int e : result){
	            System.out.print(e+"\t");
	        }
	}

}
