public class Exercise6 { 
 
    // Question  We have to write a program to multipy the corresponding elements of the two arrays 


    
    public static void main(String[] args) {
         
    
        int arr1[] = {3,4,5,6}; 
        int arr2[] = {2,2,2,2}; 
          
        int arr3[] = new int[4]; 

        for(int i =0; i<arr1.length; i++)
        {
            for(int j = 0; j<arr2.length; j++) {
                
                arr3[i] = arr1[i]*arr2[j]; 
            }
        }
    
       for(int x = 0; x<arr3.length ; x++)
       {
        System.out.println(arr3[x]);
       }

    }
    
}
