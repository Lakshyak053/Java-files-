import java.io.*;
interface even{
          boolean check(int n);
}
interface isfactor{
          boolean factorcheck(int n,int m);
}
class negativemain{
             public static void main(String[] args){
                    even num;
                    num=(n)->(n<0);
                    if(num.check(-11))
                    {
                          System.out.println("number is neagative");
                    }else{
                    System.out.println("not neagative");
                    }
                    isfactor x;
                    x=(n,m)->(n%m)==0;
                    if(x.factorcheck(10,5)){
                    System.out.println("number is factor of each other");
                    } 
}
}
