package phase2;

import java.io.*;

public class StringRecognizer {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StackReferenceBased stack = new StackReferenceBased();
      System.out.print("\nType letters: ");
      String str = br.readLine();

  int i = 0;
      while (i < str.length() && str.charAt(i) != '$') {
         stack.push(str.charAt(i++));
      }
      
      if (i == str.length()) {
          System.out.println("Invalid input: Missing '$' separator.");
          return;
      }
      i++;

      boolean isReverse = true;

      while (i < str.length() && isReverse) {
         try {
            Object stackTop = stack.pop();
            if ((char) stackTop == str.charAt(i)) {
               i++;
            } else {
               isReverse = false;
            }
         } catch (StackException e) {
            isReverse = false;
         }
      }

     if (isReverse && stack.isEmpty()) {
         System.out.println("aString is in language");
      } else {
         System.out.println("aString is not in language");
      }
   }
}