//
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining. 
//
//
//
// For example, 
// Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
//
//
//
//
// The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!


class Solution {
    public int trap(int[] height) {
        int max = 0;
        int result = 0;
        int tower = 0;
        for (int i = 0; i < height.length; i++){
            if (height[i] > max) {
                max = height[i];
                tower = i;
            }
        }
        for (int i = 1; i < tower; i++){
            if (height[i] < height[i-1]){
                result += height[i-1] - height[i];
                height[i] = height[i-1];
            }
        }
        for (int i = height.length - 2; i > tower; i--){
            if(height[i] < height[i+1]){
                result += height[i+1] - height[i];
                height[i] = height[i+1];

            }
        }
        return result;
    }
}
