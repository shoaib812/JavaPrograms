public class StringDemo1
{
    public static void main(String[]args)
    {
//        char ch[] = {'j', 'a', 'v', 'a'};
//        String string = new String(ch);
//        System.out.println(string);
//
//        System.out.println();
//        System.out.println();
//        char ch1[] = string.toCharArray();
//        for(int i=0; i<ch1.length; i++)
//        {
//            System.out.print(ch1[i]);
//        }
        StringDemo1 sd = new StringDemo1();
        String str = "RABBIT";

        String res = sd.stringMethod(str);
        System.out.println(res);

    }

    public String stringMethod(String str)
    {
        String temp = "null" ;
        for(int i=0; i<str.length(); i++)
        {
            for(int j=1; j<str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    return temp = String.valueOf(str.charAt(i));
                }
            }
        }
      return temp;
    }
}
