import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int n;
    public static int[] arr;
    public static int[] arr2;
    public static int idx =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr= new int[n];
        
        arr2 = new int[n*n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x= arr[i]+arr[j];
                arr2[idx++]=x;
            }
        }
      //  System.out.println("idx:"+idx);
      //  for(int i=0;i<idx;i++){
     //       System.out.println(arr2[i]+" ");
     //   }System.out.println();

        Arrays.sort(arr2);
      //  System.out.println(Arrays.toString(arr2));

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                int x = arr[i]-arr[j];
                if(binarySearch(x)){
                    System.out.println(arr[i]);
                    return;
                }      
            }
        }

       
        
    }

   
   public static boolean binarySearch(int value){
       int left  =0;
       int right = arr2.length-1;

       while(left<=right){
           int mid = left+(right-left)/2;
           int v = arr2[mid];
           if(v==value){
               return true;
           }
           if(v<value)left=mid+1;
           else right=mid-1;
       }
       return false;
   } 
}