/** String processing exercise 2. */
/*public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
   /* public static String uniqueChars(String s) {
        // Replace the following statement with your code
        return null;
    }
}*/

public class UniqueChars {
    public static void main(String[] args) {
        /*if (args.length == 0) {
            System.out.println("Please provide a string argument.");
            return;
        }*/

      String str = args[0];
      
       
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the character is a space or a non-duplicate character
            if (currentChar == ' ' || str.indexOf(currentChar, i + 1) == -1) {
                result.append(currentChar);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println( result.toString());
    }
}
