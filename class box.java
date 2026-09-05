/*create a class box that uses a parametrized constructor to initialize the dimensions of a box .The dimensions of the box are width,height,depth.The class should have a method that can return the volume of the box .create an object of the box class and test the functionalities*/
import java.util*;
class box
{
    double l,b,h;
    //default con
    box()
    {
          l=0.0;
          b=0.0;
          h=0.0;
    }
    box (double l,double b,double h)
    {
         this.l=l;this.b=b;this.h=h;
    }
    public double cal()
    {
    return l*b*h;
    }
    public static void main(string arg[])
    {
        Scanner s=new scanner(system.in);
        box b=new box();
        System.out.println("Enter l,b,h");
        double l1=s.nextDouble();
        double b1=s.nextDouble();
        double h1=s.nextDouble();
        box b1=new box(l1,b1,h1);
        System.out.println("length is "+l1);
        System.out.println("breadth is "+b1);
        System.out.println("height is "+h1);
        System.out.println("vol is"+ob1.cal());
     }
}

        