import java.util.*;

class Triangle{
            public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
             int i1=sc.nextInt();
             int i2=sc.nextInt();
             int i3=sc.nextInt();
              if(i1<20 && i2<20 && i3<20){
                     try{
                          if(i1+i2>i3 && i1+i3>i2 && i2+i3>i1){
                               System.out.println("Valid Triangle");
                          }
                        }
                     catch(InvalidTriangleException e){
                               System.out.println("Invaid Triangle");
                        }
                }else{
                    System.out.println("Invalid Input");
                }
          }
}
           