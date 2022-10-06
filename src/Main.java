public class Main {

    public void sizeOfArray(){
        int arr[] = {1, 2, 3, 4, 5};
        int temp=0;
        //System.out.println(arr.length);
        for(int i=0; i<arr.length; i++)
        {
            //temp = arr[i];
//            System.out.print(" "+ arr[i]);
            temp++;
        }
        System.out.println();
        System.out.println(temp);

    }

    public void stringImmutable(){
//        first field : 69609650
//        Second field : 83766130
        String fisrt = new String("Hello");
        String second =new String("World");
        //fisrt=new String("World");
        second=new String("Hello");

        System.out.println("first field : "+fisrt.hashCode());
        System.out.println("Second field : "+second.hashCode());
    }

    public void sumOfTwoArrays()
    {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 5, 5, 5, 5};
        int index = arr1.length;
        int newArr[] = new int[ index + arr2.length];
        int sum;

        for(int i=0; i<arr1.length; i++)
        {
            newArr[i] = arr1[i];

        }
            for(int k =0; k< arr2.length; k++){
            newArr[index+k] = arr2[k];
            }

        System.out.println(newArr);
        for(int x : newArr)
        {
            System.out.print(" "+x);
        }
    }
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        Main m = new Main();
       // m.sizeOfArray();
       // m.sumOfTwoArrays();
        m.stringImmutable();
    }
}