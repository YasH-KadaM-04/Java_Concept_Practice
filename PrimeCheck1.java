import java.util.Scanner;
public class PrimeCheck1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter How many Number you Have to Check whether Prime Or Not");
int n=Sc.nextInt();
System.out.println("enter a Number you have to Checked");
for( int i=0; i<n; i++){
    int m=Sc.nextInt();
    int count=0;
    for( int j=1; j<=m; j++){
    if( m%j==0){
        count=count+1;

    }
}
if (count==2){
System.out.println( "Yes Number "+m+" Is Prime");
}
else
{
    System.out.println(" No Number " +m+" Not prime");
}

    }
}}

// problem in this is that its complexity is more bacause we  there are some unnecessary  things in this code Which can be optimized to reduced complexity
// 1) after noticing that every number If have to to be divide completely then it will be Divide upto its  square root Or the same factor appear again i.e 12=3*4 or 4*3 so Need not  to perform This  instead of this we can  use j*j i.e root <=m so It reduces complexity
//2)Also, Instead of starting from 1 we start from 2 because each number is divisible by one   need not to Checked by one 
//3) if we found more one number which is divisible then why should we run the whole loop to check it Wwe can use the Break statement unstead  of Running Whole Loop 
//  This whole changes will be perform on the Mod_Prime file Checked that one