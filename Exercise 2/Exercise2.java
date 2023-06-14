import java.util.Scanner;

public class Exercise2 { 

    /*Question Write a program that takes input as radius from the user and print the radius 
     * and perimeter of the circle. 
     */
     
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        System.out.println("Entre the radius of the circle: ");

        double radius = scan.nextDouble(); 
        
        System.out.println("Area of the circle is : " + 3.14*radius*radius + "Unit^2");
        System.out.println("Perimeter of the circle is : " + 2*3.14*radius + "Unit");
    }
}
