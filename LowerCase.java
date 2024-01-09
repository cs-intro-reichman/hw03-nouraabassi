/** String processing exercise 1. */
/*public class LowerCase {
    public static void main(String[] args) {  
        //String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
   /* public static String lowerCase(String s) {
        // Replace the following statement with your code
        return null;
    }
}*/

public class LowerCase {
    public static void main(String[] args) {
       /*  if (args.length == 0) {
            System.out.println("No argument provided.");
            return; // Exit the program if no arguments are provided
        }*/

       String str = args[0];
    
        int length = str.length();
        int x = 0;

        while (x < length) {
            char L = str.charAt(x);
            String letter = Character.toString(L);

            if (Character.isUpperCase(L)) {
                letter = letter.toLowerCase();
            }

            System.out.print(letter);
            x++;
        }
    }
}
