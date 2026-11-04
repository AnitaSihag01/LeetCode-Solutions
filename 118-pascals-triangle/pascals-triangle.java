class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans = new ArrayList<>();
        for(int i = 1 ; i <= numRows ; i ++){
            ans.add(generateRow(i));
        }
    return ans;
    }

    public List<Integer> generateRow(int row){
        long ans = 1 ;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for( int col = 1; col < row ; col ++){
            ans = ans * (row - col );
            ans = ans / (col);
            list.add((int)ans);
        }
        return list ; 
    }
}