interface marks
{
        int m=80;
        void getMarks();
}
class AnonymousInnerClass
{
       public static void main(String[] args)
         {
                  marks objm= new marks()
                  {
                          public void getMarks()
                          {
                                      System.out.println("Marks: "+m);
                          }
                   };
                   objm.getMarks();
             }
}

