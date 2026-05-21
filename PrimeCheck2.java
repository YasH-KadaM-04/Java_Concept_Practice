
    import java.util.Scanner;
public class PrimeCheck2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter How many Number you Have to Check whether Prime Or Not:");
int n=Sc.nextInt();
System.out.println("enter a Number you have to Checked");
for( int i=0; i<n; i++){
    int m=Sc.nextInt();
    int count=0;
    for( int j=2; j*j<=m; j++){
    if( m%j==0){
        count=count+1;
        break;

    }
}
if (count==2){
System.out.println("Number Is Prime");
}
else
{
    System.out.println("Not prime");
}

    }
}}
    

