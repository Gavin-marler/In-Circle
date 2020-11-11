import java.lang.Math;
import java.util.Scanner;

public class inCircle{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter X and Y coordinates of the point");
        double ptX = myObj.nextDouble();
        double ptY = myObj.nextDouble();

        System.out.println("Enter the X and Y coordinates for the center of the Circle");
        double circleX = myObj.nextDouble();
        double circleY = myObj.nextDouble();
    
        System.out.println("Enter the radius of the Circle");
        double circleRadius = myObj.nextDouble();

        reportPoint(ptX, ptY);

        if(isPointInsideCircle(ptX, ptY, circleX, circleY, circleRadius))
        {
            System.out.print(" is inside ");
        }
        else
        {
            System.out.print(" is outside ");
        }
        reportCircle(circleX, circleY, circleRadius);
        System.out.println();
    }


static void reportPoint(double x, double y)
{
    System.out.print("Point(" + x + ", " + y + ")");
}

static void reportCircle(double x, double y, double r)
{
    System.out.print("Circle(" + x + ", " + y + ") " + "Radius: " + r);
}

static boolean isPointInsideCircle(double ptX, double ptY, double circleX, double circleY, double circleRadius)
{
    if (circleRadius >= Math.sqrt(Math.pow((ptX - circleX), 2) + Math.pow((ptY - circleY), 2)))
    {
        return true;
    }
    else 
    {
        return false;
    }
}
}