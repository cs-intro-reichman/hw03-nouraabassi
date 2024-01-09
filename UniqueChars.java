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
        String str = args[0];

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == ' ' || !isDuplicate(str, currentChar, i)) {
                result.append(currentChar);
            }
        }

       // System.out.println("Original String: " + str);
        System.out.println(result.toString());
    }

    private static boolean isDuplicate(String str, char currentChar, int currentIndex) {
        for (int i = 0; i < str.length(); i++) {
            if (i != currentIndex && str.charAt(i) == currentChar && currentChar != ' ') {
                return true;
            }
        }
        return false;
    }
}
