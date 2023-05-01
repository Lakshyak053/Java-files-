abstract class marks{
           int m1=50;
           int m2=30;
           int m3=20;
           abstract void average();
}

class mainAbstractclass{
              public static void main(String[] args)
              {
                       marks objm =new marks()
                       {
                            void average()
				{
                                      System.out.println("average: "+((m1+m2+m3)/3));
                            }
                      };
                      objm.average();
}
}
 