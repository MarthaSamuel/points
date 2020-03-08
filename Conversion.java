
/**
 * Conversion from one primitive type to another
 * N2c
 * @author: Dimgba Martha Otisi
 * @version (a version number or a date)
 *  @martha_samuel_
 */
public class Conversion {
public Conversion(){
    //implcit conversion from int to double,long,float
    int x=3;
    double d=x;
    long l=x;
    float f=x;
    System.out.println("double"+" "+d);
    System.out.println("long"+" "+l);
    System.out.println("float"+" "+f);
    //explicit conversion from double to int
    double y=3.14;
    int w=(int)y;
    long z=(long)y;
    short b=(short)y;
    System.out.println("long"+" "+l);
    System.out.println("int"+" "+w);
    System.out.println("short"+" "+b);
    /*converting from strings to integer using the method integer.parseInt
    String s="3";
    int t=integer.parseInt(s);
    System.out.println("int"+" "+t);*/
    
}
}
