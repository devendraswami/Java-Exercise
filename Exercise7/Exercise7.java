import java.util.Scanner;

public class Exercise7 { 
    public static void main(String[] args) {
        
        //Question We have to calcualte even and odd digits in an array 

        int arr1[] = {2,3,4,5,6,7};  

        Scanner scan = new Scanner(System.in); 

          

        int odds = 0; 
        int evens = 0; 

        for(int i = 0; i<arr1.length; i++) 
        {
            if(arr1[i] % 2 == 0 )
            {
                evens++; 
            } 
            else {
                odds++;  

            }
        } 

        System.out.println("No of odd digits in the array is " + odds); 
        System.out.println("No of even digits in the array is " + evens);
    }
    
}
