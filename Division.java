import java.util.*;
 
class Division{
          public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               int i1=sc.nextInt();
               int i2=sc.nextInt();
               int div = i1/i2;
               try{
                     System.out.println(div);
               }
               catch(ArithmeticException A){
                     System.out.println(A);
               }
         }
}

                     