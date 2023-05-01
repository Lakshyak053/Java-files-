class Box{
        double width;
        double height;
        double depth;
        Box(){
             width=-1;
             height=-1;
             depth=-1;     
        }
        Box(double a,double b, double c){
            width=a;
            height=b;
            depth=c;
        }
        Box(double x){
            width=x;
            height=x;
            depth=x;
        }
        Box(Box obj){
            width=obj.width;
            height=obj.height;
            depth=obj.depth;
        }
        double Volume(){
            return(width*height*depth);
        }
}
class BoxWeight extends Box{
            double weight;
            BoxWeight(double a,double b,double c,double d){
                width=a;
                height=b;
                depth=c;
                weight=d;
            }
} 
class BoxColor extends Box{
            String color;
            BoxColor(double a,double b,double c,String d){
                width=a;
                height=b;
                depth=c;
                color=d;
            }
}
class BoxShipment extends BoxWeight{
           double cost;
           BoxShipment(double a,double b,double c,double d,double e){
                super(a,b,c,d);
                cost=e;
     }
}
class Inheritance2
{
           public static void main(String[] args)
           {
               BoxColor obj = new BoxColor(10,15,20,"Blue");
               System.out.println(obj.color+" Volume ="+obj.Volume());
               BoxShipment obj1 = new BoxShipment(10,15,20,50,100);
               System.out.println(obj1.weight+" Volume ="+obj1.Volume()+" "+obj1.cost);
               
               
            }
}
