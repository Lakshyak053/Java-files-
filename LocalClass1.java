class LocalClass1
{
      int x=10;
      int returnValue(){
               return x;
       }
       public static void main(String[] args){
                     LocalClass1 obj1= new LocalClass1();
                     if(onj1.x<20)
                     {
                        class LocalInnerClass1
                        {
                               void print(){
                                         System.out.println("Local Inner Class Created");
                                         System.out.printlnn(obj1.returnValue());
                               }
                         }
                         LocalInnerClass1 obj2= new LocalInnerClass1();
                         obj2.print();
}
else
{
           System.out.println("No Local Inner Class Created");
}
}