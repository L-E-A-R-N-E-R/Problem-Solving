class Container_with_most_water {
    public int maxArea(int[] height) {
        int area = 0;
        int i=0,j=height.length-1;
        while(i<j){
            if(height[i]<height[j]){
                area = Math.max((j-i)*height[i],area);
                i++;
            }
            else{
                area = Math.max((j-i)*height[j],area);
                j--;
            }
        }
        return area;
    }
}