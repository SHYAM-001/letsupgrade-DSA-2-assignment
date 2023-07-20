import java.util.*;

public class assignment {

    public static boolean anagrams(String str1, String str2) {
        // Remove spaces and punctuation and convert to lowercase
        String processedStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String processedStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if lengths are the same after removing spaces and punctuation
        if (processedStr1.length() != processedStr2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = processedStr1.toCharArray();
        char[] charArray2 = processedStr2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(anagrams(str1, str2)); // Output: true

        str1 = "restful";
        str2 = "fluster";
        System.out.println(anagrams(str1, str2)); // Output: true
    }
}
