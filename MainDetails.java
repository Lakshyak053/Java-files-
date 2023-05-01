import java.util.Scanner;  
class Cricket
{      
      int player;
      int TotalScore;
      Cricket()
      {
              Scanner sc = new Scanner(System.in);
              player = sc.nextInt();
      }
      void get_Detail()
      {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter your details :");
              rollno = sc.nextInt();
              grades = sc.next().charAt(0);
      }
      void print_detail()
      {
              System.out.println(Section+" "+rollno+" "+grades);
      }
}
class MainDetails
{
 public static void main (String[] args){
           details d1 = new details();
            
            d1.get_Detail();
            d1.print_detail();
            details d2 = new details();
            d2.get_Detail();
            d2.print_detail();
            details d3 = new details();
            d3.get_Detail();
            d3.print_detail();
          }
}

            
               