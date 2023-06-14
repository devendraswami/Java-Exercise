import java.util.Scanner;


class JavaExercise1 { 

    /* Question Write a program that gets 2 numbers from user and displays the division and remainder.  */
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 

        System.out.println("Please entre n1 and n2 : " ); 
        
        int n1 = scan.nextInt(); 
        int n2 = scan.nextInt(); 

        // we have to display reminder and Quotient of n1/n2 

          System.out.println("The Remainder is : " + n1 % n2 );
          System.out.println("The Qutotient is : " + n1/n2);
    }
}