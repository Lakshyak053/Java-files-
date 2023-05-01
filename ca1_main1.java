import java.util.Scanner;
class Ca1_1{
        int b;
         void read(){
              Scanner sc = new Scanner(System.in);
              b  = sc.nextInt();
              }
         void Solve(){
              int c = b-10;
              if(b<10){
              System.out.println(b);
              }
              else if(b>9 && b<36){
              System.out.println('A'+ c);
              }
}
}
class  ca1_main1{
         public static void main(String[] args){
               Ca1_1 r = new Ca1_1();
               r.read();
               r.Solve();
         }
}

             