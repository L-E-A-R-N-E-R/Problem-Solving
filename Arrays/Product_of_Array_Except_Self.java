class Product_of_Arrays_Except_Self{
    public int[] productExceptSelf(int[] nums){
        int[] prod = new int[nums.length];
        int pre = 1;
        for(int i=0;i<nums.length;i++){
            prod[i] = pre;
            pre = pre*nums[i];
        }
        int post = 1;
        for(int i=nums.length-1;i>=0;i--){
            prod[i] = prod[i]*post;
            post = post*nums[i];
        }
        return prod;
    }
}