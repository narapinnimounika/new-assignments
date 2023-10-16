
import java.util.Random;
;class Arrayshuffle{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("before shuffling");
        for(int i=0;i<=6;i++)
        {
        System.out.println(arr[i]);
        }
        
        Random r = new Random ();
        System.out.println("after shuffling");
        for(int i=0;i<=6;i++)
        {
            int rannum=r.nextInt(arr.length);
            int temp = arr[rannum];
           arr[rannum] = arr[i];
            arr[i] = temp;
            System.out.println(arr[i]);
            
        }
        


    }
}