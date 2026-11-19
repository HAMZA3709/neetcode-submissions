class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> n = new ArrayList<>();
        for (int num :nums) {
    n.add(num);
}
        for(int i=0;i<nums.length;i++){
            int dif=target-nums[i];
            if(n.contains(dif)&&i!=n.indexOf(dif)){
                int[] result = new int[]{i, n.indexOf(dif)};
    Arrays.sort(result);
    return result;

            }
            
        }
        return new int []{};
    }
}
