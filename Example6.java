import java.util.Scanner;

class Example6
{
   public static void main(String[] args)
   {
      int num, temp,a,b;
      Scanner sn = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = sn.nextInt();
      temp = num;
      for(i=2; i<num; i++)
      {
         if(num%i == 0)
         {
            count++;
            break;
         }
      }
      
      if(count==0)
         System.out.println("\nIt is a Prime Number.");
      else
         System.out.println("\nIt is not a Prime Number.");
   }
}
