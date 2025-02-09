package Question_Problem.searching;

public class Searching {

    public static void main(String[] args) {

        int[] arr={1,1,2,2,2,2,3};
        System.out.println(count(arr,3));

    }
    static int  LinearSearch(int[] arr, int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val)
                return val;
        }
        return -1;
    }

    static int Binary(int[] arr, int val){
        int low = 0, high = arr.length-1, mid;
        while (low <= high){
            mid = (low + high)/2;
            if (arr[mid] == val)
                return mid;
            if (val < arr[mid])
                high = mid-1;
            else
                low= mid + 1;
        }
        return -1;
    }

    // sqr(x)
    static int Mysqr(int x){
        if(x==1)
            return 1;
       long low = 1;
       long high = x / 2;
       long mid;

       while(low <=high){
           mid = (low+high)/2;
           long sqr=mid*mid;
           if(sqr == x)
               return (int)mid;
           if (sqr>x)
               high = mid - 1;
           else
               low = mid +1;
       }
       return (int)high;
    }



    static int CountNum(int[] arr , int val){
        int  l = 0, h = arr.length-1, mid;

        while (l <= h){
            mid = (l+h) / 2;

        if(arr[mid] == val ){
            return mid;
        }
        if (val<arr[mid]){
            h = mid -1;
        } else l = mid + 1;
    }
        return -1;
    }

    static int count (int[] arr , int x){
       int index = CountNum(arr,x);
       if(index == -1)
           return 0;

           int left=0, right = 0;
           for (int i = index-1; i >= 0 && arr[i] == x ; i--)
               left++;

           for (int i = index +1; i < arr.length && arr[i] == x  ; i++)
               right ++;

       return left + right + 1;
    }

}

