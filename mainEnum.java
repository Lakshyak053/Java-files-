import java.util.Scanner;
enum day
{       
      SUNDAY,
      MONDAY,
      TUESDAY,
      WEDNESDAY,
      THURSDAY,
      FRIDAY,
      SATURDAY;
}
class week
{
     day d ;
      void print(){
              String str ;
              day d_arr[] = day.values();
              for(int i =0 ; i<8;i++)
              if(d_arr[i]==day.valueOf(str)){
              System.out.println(str+" is the "+d_arr[i].ordinal()+" day of week");
              }else{
              System.out.println("Not a day of week");
              }
}
}

class mainEnum{
       public static void main(String[]args){
               Scanner sc = new Scanner(System.in);
               String str = sc.nextLine();
               str.print();
}
}
 
              
     
       
      