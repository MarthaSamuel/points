
/**
 * calculation of distance between points and the perimeter of 4 sided shape whose points are defined on a 2D space.
 * N2b
 * @author Dimgba Martha Otisi
 * 2020, January
 * @martha_samuel_
 */
public class Point {
    //fields
    int x;
    int y;
    //constructor
    public Point(int startx,int starty){
      x=startx;
      y=starty;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double distance(Point otherpt){
        int dx=x-otherpt.getX();
        int dy=y-otherpt.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    public static void main(String[]args){
     Point p1=new Point(-1,3);
     Point p2=new Point(-1,-1);
     Point p3=new Point(4,-1);
     Point p4=new Point(1,3);
     double  a= p1.distance(p2);
          double b=p2.distance(p3);
          double c=p3.distance(p4);
          double d=p4.distance(p1);
     System.out.println("Point:" + (a+b+c+d));
     //simply use this instead of the last 5 lines
     System.out.println("Point:" + (p1.distance(p2)+p2.distance(p3)+p3.distance(p4)+p4.distance(p1)));
     //to print out distance between two points
     System.out.println(p1.distance(p2));
    }
}
    
