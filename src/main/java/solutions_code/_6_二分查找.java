package solutions_code;

public class _6_二分查找 {

    public static int binarySearch(int[] arr,int num){
        int low=0;
        int upper=arr.length-1;
        while(low<=upper){
            int mid=(upper+low)/2;
            if(arr[mid]<num){
                low=mid+1;
            }
            else if(arr[mid]>num){
                upper=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }


}
