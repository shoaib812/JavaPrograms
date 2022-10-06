public class StringDemo
{

    public void addString()
    {
        String str = "123";
        int strLength = str.length();
        System.out.println(strLength);
        int temp=0;
        for(int i=0; i<strLength; i++)
        {
            temp += str.charAt(i);
            System.out.println(temp);
        }
        System.out.println(temp);
    }

    public static void main(String[]ar)
    {
       StringDemo sd = new StringDemo();
       sd.addString();
    }
}
