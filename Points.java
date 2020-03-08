
/**
 * CalculatingDistance between Pointss//
 * N2a
 * @author: Dimgba Martha Otisi 
 * @2020,January
 *  @martha_samuel_
 */

public class Points {
    //instance variables or fields
private int x;
private int y;
//constructors
public Points(int startx, int starty){
    x=startx;
    y=starty;
}
//mrthods
public int getX(){
    return x;
}
public int getY(){
    return y;
}
public double distance(Points otherPt){
    int dx=x-otherPt.getX();
    int dy=y-otherPt.getY();
    return Math.sqrt(dx*dx+dy*dy);
}
public static void main(String[]args){
 Points p1=new Points(3,4);
 Points p2=new Points(6,8);
 Points p3=new Points(9,12);
 System.out.println(p1.distance(p2));
 System.out.println(p1.distance(p3));
 System.out.println(p3.distance(p1));
}
}
