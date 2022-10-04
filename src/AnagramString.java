import java.util.*;
public class AnagramString
{
    public void anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] string1 = new char[0];
        char[] string2 = new char[0];

        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not Anagram ");
        }
        else
        {
            string1 = str1.toCharArray();
            string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);
        }

        if (Arrays.equals(string1, string2) == true)
        {
            System.out.println("Both the strings are anagram");
        } else
        {
            System.out.println("Both the strings are not anagram");
        }
    }

    public static void main(String [] args)
    {
        AnagramString as = new AnagramString();

        String str1 = "Grab";
        String str2 = "Brag";
        //String str2 = "Drag";

        as.anagram(str1, str2);
    }
}
