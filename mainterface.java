import java.io.*;
interface in1{
          final int a=10;
          void display();
}
class maininterface implements in1{ 
             public void display()
             {
                  System.out.println(a);
              }
              public static void main(String[] args)
              {
                        maininterface i1=new maininterface();
                        i1.display();
                        System.out.println(a);
              }
}