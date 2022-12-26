
import java.util.*;
public class Test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your range");
    int a=sc.nextInt();
    int x=0,y=0,z=0,sum=0,rem=0,re=0;
    for(int i=1; i<=a;i++){
        int b=i/10;
        int digit=1;
        while(b!=0){
            b=b/10;
            ++digit;
        }
            if(digit%2==0)
            {
                 if(digit%4==0)
                    {
                         y=y+digit*4;  
                     }
                 else{
                          y=y+digit*3;
                     }
            }
            else if(digit%2!=0)
            {
               x=x+digit*2;
            }
    }
   sum= x+y;
   System.out.println("starting sum of digit: "+sum);
        for (int l=1;sum!=0;l++){
       rem=rem+sum%10;
       sum=sum/10;
        }
  System.out.println("middle sum of digits :"+rem);
  for (int l=1;rem!=0;l++){
       re=re+rem%10;
       rem=rem/10;
        }
   System.out.println("last sum of digits :"+re);
   }
}