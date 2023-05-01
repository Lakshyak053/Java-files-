class Calculate
{
      void add(int a, int b)
      { 
          System.out.println(a+b);
      }
      void add(int a, int b, int c)
      { 
          System.out.println(a+b+c);
      }
      void add(float a, float b)
      { 
          System.out.println(a+b);
      }
      void add(int a , float b)
      {
          System.out.println(a+b);
      }
      void add(int a, float b, double c)
      { 
          System.out.println(a+b+c);
      }
}
class Maincalculate
{
  public static void main (String[] args){
            Calculate c = new Calculate();
            c.add(5,6);
            Calculate c1 = new Calculate();
            c1.add(5,6,9);
            Calculate c2 = new Calculate();
            c2.add(5/2,6/3);
            Calculate c3 = new Calculate();
            c3.add(5,6.0f);
            Calculate c4 = new Calculate();
            c4.add(5,6.0f,7.0d);
        }
}
            