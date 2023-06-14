import java.util.Scanner;

public class Exercise5 { 
    public static void main(String[] args) {
        // Question we have to  reverse a String 
       
        Scanner scan = new Scanner(System.in); 
        System.out.println("Entre the String : "); 
        
        String str = scan.next();  

        String str2 = ""; 
       char[] str1 = str.toCharArray(); 

       for(int i = str.length()-1; i>=0; i--)
       {
        str2 += str1[i];
       }

       System.out.println("The Reverse of the String is : " + str2);

    }
    
}
