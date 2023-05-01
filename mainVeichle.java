import java.io.*;
interface vehicle
{
void GearChange(int x);
void SpeedIncrease(int x);
void Breaks(int x);
}
class Bike implements vehicle
{
int speed, gear;
public void GearChange(int a)
{
gear=a;
}
public void SpeedIncrease(int a)
{
speed= speed+a;
}
public void Breaks(int a)
{
speed=speed-a;
}
void display()
{
System.out.println("Gear: "+gear+" "+"Speed: "+speed);
}
}
class bicycle implements vehicle
{
int speed, gear;
public void GearChange(int a)
{
gear=a;
}
public void SpeedIncrease(int a)
{
speed= speed+a;
}
public void Breaks(int a)
{
speed=speed-a;
}
void display()
{
System.out.println("Gear: "+gear+" "+"Speed: "+speed);
}
}
class car implements vehicle

{
int speed, gear;
public void GearChange(int a)
{
gear=a;
}
public void SpeedIncrease(int a)
{
speed= speed+a;
}
public void Breaks(int a)
{
speed=speed-a;
}
void display()
{
System.out.println("Gear: "+gear+" "+"Speed: "+speed);
}
}
class mainVeichle{
         public static void main(String[] args){
                bicycle b1 = new bicycle();
                b1.GearChange(3);
                b1.SpeedIncrease(30);
                b1.Breaks(10);
                Bike B1 = new Bike();
                B1.GearChange(3);
                B1.SpeedIncrease(30);
                B1.Breaks(10);
                car c1 =new car();
                c1.GearChange(5);
                c1.SpeedIncrease(140);
                c1.Breaks(30);
                b1.display();
                B1.display();
                c1.display();
}
}



                  