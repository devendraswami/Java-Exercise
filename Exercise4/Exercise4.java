import java.util.Scanner;

public class Exercise4 {
     
    public static void main(String[] args) { 
         
        // Question  We have to tell that how many letters , spaces and number exsit in a given String  
        int letter =0; 
        int digits = 0; 
        int spaces = 0;  
        int specialCharacter = 0; 

        Scanner scan = new Scanner(System.in); 
        
       System.out.println("Entre the String : "); 

       String str = scan.nextLine();
  
       for(int i = 0; i<str.length(); i++) {
        
        char ch = str.charAt(i); 

        if( Character.isLetter(ch)) {
             letter++; 
        } 
         else if(Character.isDigit(ch))  {  
                     digits++; 
        } 
         else if(Character.isSpaceChar(ch)) {
            spaces++; 
         } 
           else {
            specialCharacter++; 
           }
        
           
       }  


       System.out.println("The numbers of letters in the String is : " + letter);
       System.out.println("The numbers of the spaces in the String is : " + spaces);
       System.out.println("The number of the digits in the string is : " + digits); 
       System.out.println("The number of the special charaters in the string are  : " + specialCharacter);

    }
}
