class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ;
         int high = maxi(piles);
         int ans = Integer.MAX_VALUE ; 
         while(low <= high){
            int mid = low + ( high - low ) / 2 ; 
            int totalHr = func( piles , mid ); 
            if( totalHr <= h) {
                ans = mid ;
                high = mid -1 ;
            }
            else{
                low = mid + 1;
            }
         }
          return ans ; 
    }

    public int maxi(int[] arr){
        int maxi = Integer.MIN_VALUE ;
        int n = arr.length ;
        for( int i = 0 ;i < n ; i ++ ){
            maxi= Math.max(maxi,arr[i]);
        }
        return maxi ;
    }

    public int func(int []arr,int m){
        int hr = 0 ;
         for (int i = 0; i < arr.length; i++) {
        hr += Math.ceil((double) arr[i] / m);
        }
        return hr;
    }
}