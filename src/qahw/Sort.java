package oo;

public class Sort {

	
	 
    public void bubbleSort(int[] a) {
        int temp;
        for(int i=a.length-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    
    public  void print(int[] a) {
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    //////////////////////////////////////////////
    public  void bubbleSort(double[] b) {
        double temp;
        for(int i=b.length-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(b[j] > b[j+1]){
                    temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }
    
    public  void print(double[] b) {
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
    ///////////////////////////////////////////
 public  void bubbleSort(String[] s) {
        String temp;
        for(int i=s.length-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(s[j].compareTo(s[j+1])>0){
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
    }
    
    public  void print(String[] s) {
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
