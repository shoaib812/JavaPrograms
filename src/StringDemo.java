public class StringDemo
{

    public void addString()
    {
        //String str = "123";
//        String str = "5555";
        String str = "12DD12";
        int strLength = str.length();
        System.out.println(strLength);
        int temp=0;
        char ch;
        int add=0;
        for(int i=0; i<strLength; i++)
        {
           // temp = str.charAt(i);
            ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                temp = Character.getNumericValue(ch);
                add += temp;
            }
        }
        System.out.println(add);
    }

    public static void main(String[]ar)
    {
       StringDemo sd = new StringDemo();
       sd.addString();
    }
}
