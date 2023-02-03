class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int t=0;t<nums.length;t++){
            if(t>0 && nums[t]==nums[t-1]){
                continue;
            }
            int j = nums.length-1;
            int i = t+1;
            while(i<j){
                if(nums[t]+nums[i]+nums[j]==0){
                    List<Integer> set = new ArrayList<>();
                    set.add(nums[t]);set.add(nums[i]);set.add(nums[j]);
                    result.add(set);
                    i++;
                    while(i<j && nums[i]==nums[i-1]){
                        i++;
                    }
                }   
                else if(nums[t]+nums[i]+nums[j]<0){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return result;
    }
}