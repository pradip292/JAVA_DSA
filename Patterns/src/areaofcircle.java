
import java.util.*;
public class areaofcircle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        float rad = sc.nextFloat();
        float pi=3.14f;
        float area= pi*rad*rad;
        System.out.println("Area of Circle is "+area);

    }
}
