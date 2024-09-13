package OutputNumbersInReverse;

import java.util.Scanner;

public class OutputNumbersInReverse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      int[] userList = new int[numElements];   

      for(int i = 0; i < numElements; ++i){
         userList[i] = scnr.nextInt();
      }

      for(int i = numElements - 1; i >= 0; --i ){
         System.out.print(userList[i] + ",");
      }
      
      scnr.close();
   }
}
