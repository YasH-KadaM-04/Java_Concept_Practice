
// import java.util.Scanner;


// public class Prime_No_3
// {
// 	public static void main(String[] args) {
// 	    Scanner sc= new Scanner(System.in);
// 		System.out.println("ENTER THE Digit UP TO WHICH  you have to print Prime No:");
// 	    int x=sc.nextInt();
//         for (int i=2; i<x; i++){
//           int count=0;
// 	      for(int j=1;j<=i; j++){
// 	          if(i%j==0){
// 	              count=count+1;
// 	          }
// 	      }
//           if(count==2){
//             System.out.println(i);
//           }
// 	  }
	      
// 	  }
// 	}


public class PrintPrime {
    public static void main(String[] args) {
        int n = 10;

         for (int i = 2; i <= n; i++) {// start from 2 because 1 is nither prime 
            int count = 0;
            for (int j = 2; j < i; j++) { // this main starting from two beacuse every number is divisible by 1 also less than i
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) { // this so important i.e not less than 2 because  for 4 and 9 we found on divsor so condition fail                use count==0 i number not include i.e j<i
                System.out.println(i +"  is  prime ");
            }
            else{
                System.out.println(i +"  is  Not prime ");
            }
        }
    }
}