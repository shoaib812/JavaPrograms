public class ArrayAverage1
{
    public static void main(String[]args)
    {
        ArrayAverage1 av = new ArrayAverage1();
        int arr[] = {11, 22, 33, 44, 55};
        int arr1[] = {11, 22, 33, 44, 55};
        int arr2[] = {22, 33, 44, 55, 66};
        int arr3[] = arr;
       // av.averagMethod(arr);
        av.compareArrays(arr, arr1, arr2, arr3);
    }
//    public void averagMethod( int arr[])
//    {
//        double total =0.0;
//        double avg = 0.0;
//        System.out.print("Total : ");
//        for(int i=0; i<arr.length; i++){ total += arr[i]; }
//        //System.out.print(total);
//        avg = total/arr.length;
//        System.out.println(avg);
//    }

    public void compareArrays(int arr[], int arr1[], int arr2[], int arr3[])
    {
        if(arr == arr1){ System.out.println("arr & arr1 are same"); }
        else{   System.out.println("arr & arr1 are not same"); }

        if(arr == arr2){ System.out.println("arr & arr2 are same"); }
        else{   System.out.println("arr & arr2 are not same"); }

        if(arr == arr3){ System.out.println("arr & arr3 are same"); }
        else{   System.out.println("arr & arr3 are not same"); }

    }
}
