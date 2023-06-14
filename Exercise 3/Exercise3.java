import java.util.Scanner;

public class Exercise3 {
      
   
    public static void main(String[] args) {
     // Question We have to write a program to convert Decimal number to Binary number 
     
     // First will we take input from the user 

     Scanner scan = new Scanner(System.in); 
     System.out.println("Entre the Decimal number : " );
     
     int n = scan.nextInt(); 

     int quo; 
     quo = n;
     int i = 1; 

     // lets create an array to store the Binary number 

     int nums[] = new int[100]; 

     while(quo !=0)
     { 
        nums[i++] = quo%2; 
        quo = quo/2; 
         

     }
   
     // To print the Array 
     for(int j = i-1; j>0 ; j--)
     {
        System.out.println(nums[j]);
     }

    }
}
