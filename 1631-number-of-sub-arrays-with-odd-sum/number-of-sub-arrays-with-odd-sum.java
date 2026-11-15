class Solution {
    public int numOfSubarrays(int[] arr) {
     int count = 0 ;
     int n = arr.length ;
        int even = 1 ;
        int odd = 0 ;
        int prefixSum  = 0 ;
        int mod = 1000000007 ;
    for( int i = 0 ; i < n ; i ++ ){
        prefixSum += arr[i] ;

        if(prefixSum % 2 == 0 ){
            count = (count + odd )% mod;
            even ++ ;
        }
        else{
            count = (count + even ) % mod;
            odd ++ ;
        }
    }
    return count;
    }
}