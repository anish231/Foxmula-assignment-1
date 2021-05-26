
package oops.ans3;


abstract class Quadrilateral{
     int x1;
     int y1;
     int x2;
     int y2;
     int x3;
     int y3;
     int x4;
     int y4;

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
     
    
    abstract public double area();
  
}


class Trapezoid extends Quadrilateral{
   
    
    
    int height;

    public Trapezoid(int a, int b, int c, int d, int e, int f,int g,int h,int hei) {
        super(a, b, c, d, e, f,g,h);
        this.height=hei;
    }
    
    @Override
    public double area()
    {
        double a1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double a2 = (double)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        double ans= (double)((a1+a2)*height)/2;
        
        
        return ans;
        
    }
    
}

class Parallelogram extends Quadrilateral{
   
    
    
    int height;

    public Parallelogram(int a, int b, int c, int d, int e, int f,int g,int h,int hei) {
        super(a, b, c, d, e, f,g,h);
        this.height=hei;
    }
    
    @Override
    public double area()
    {
        double a1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double ans= (double)a1*height;
        
        
        return ans;
        
    }
    
}

class Rectangle extends Quadrilateral{

    public Rectangle(int a, int b, int c, int d, int e, int f,int g,int h) {
        super(a, b, c, d, e, f,g,h);
    }
    
    @Override
    public double area()
    {
        double a1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double a2 = (double)Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double ans= (double)a1*a2;
        
        
        return ans;
        
    }
    
}


class Square extends Quadrilateral{

    public Square(int a, int b, int c, int d, int e, int f,int g,int h) {
        super(a, b, c, d, e, f,g,h);
    }
    
    @Override
    public double area()
    {
        double a1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double ans= (double)a1*a1;
        
        
        return ans;
        
    }
    
}






public class OopsAns3 {

    public static void main(String[] args) {
        Quadrilateral q1= new Square(1,2,3,2,3,4,1,4);
        System.out.println("Area of SQUARE= "+q1.area());
        Quadrilateral q2= new Trapezoid(0,0,20,0,17,6,8,6,6);
        System.out.println("Area of Trapezoid= "+q2.area());
        Quadrilateral q3= new Parallelogram(10,10,30,10,20,20,0,20,8);
        System.out.println("Area of Parallelogram= "+q3.area());
        Quadrilateral q4= new Rectangle(2,4,6,4,6,10,2,10);
        System.out.println("Area of Rectangle= "+q4.area());
    }
    
}
