
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

  
	 
public static String uniqueChars(String str) {
        String fin = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean duplicate = false;
			for (int j = 0; j < fin.length(); j++) {
				if (fin.charAt(j) == ch) {
					duplicate = true;
					break;
				}		
			}
			if (!duplicate || ch == ' ') {
				fin += ch;
			}
		}
		return fin;
	}
}
