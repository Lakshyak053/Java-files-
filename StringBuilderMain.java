imort java.io.*;

class StringBuilderMain
{
            public static void main(String args[]){
                   StringBuilder s1 = new StringBuilder("hello");
                     s1.append(" world");
                     System.out.println(s1);
                     s1.insert(6," beautiful ");
                     System.out.println(s1);
                     s1.replace(6,9," ");
                     System.out.println(s1);
                     s1.reverse();
                     System.out.println(s1);
                     }
}
                     
                     