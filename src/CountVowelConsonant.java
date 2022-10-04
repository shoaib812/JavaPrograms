public class CountVowelConsonant
{
    public static void main(String[]args)
    {
        CountVowelConsonant cvc = new CountVowelConsonant();
        String str = "This is a really simple sentence";
        cvc.count(str);
    }

    public static void count(String str)
    {
        int vCount = 0;
        int cCount = 0;
        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                vCount++;
            }

            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                cCount++;
            }
        }
        System.out.println("Total no of vowel : "+ vCount );
        System.out.println("Total no of constant : "+ cCount );
    }
}
