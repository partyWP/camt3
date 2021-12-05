public class area 
{
double width;
double height;
double area;
double per;

public area(double wid , double hei )
{
    width = wid;
    height = hei;
    area = wid * hei;
    per = 2 * (wid + hei );
}
public double getarea(){return area;}
public double getper(){return per;}



}