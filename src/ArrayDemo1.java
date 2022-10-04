import java.sql.SQLOutput;

public class ArrayDemo1
{
    public static void main(String[]ar)
    {
        int arr[] = new int[5];
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//
//        System.out.println();
//        System.out.println();

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;

        for(int i=0; i<arr.length; i++)
        {

            System.out.println(arr[i]);
        }
//        System.out.println();
//        System.out.println();
//          for(int x : arr)
//          {
//              System.out.println(x);
//          }

        int arr1[][];
        arr1 = new int[2][2];

        arr1[0][0] = 11;
        arr1[0][1] = 22;
        arr1[1][0] = 33;
        arr1[1][1] = 44;


        System.out.println("Two Dimensional Array");
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1.length; j++)
            {
                System.out.print(" "+ arr1[i][j] +" ");
            }
            System.out.println();
        }


        System.out.println("Jagged Array");
        //int arr2[][] = new int[2][3];
        int arr2[][] = {{1, 2}, {3, 4}, {5, 6}};

        for(int i=0; i<=arr2.length; i++)
        {
            for(int j=0; j<=arr2.length; j++)
            {
                System.out.print(" "+ arr2[i][j] +" ");
            }
            System.out.println();
        }

    }
}
