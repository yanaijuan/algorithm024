/*
题目：给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
思路：
毫无思路，看来要多看两次视频，好好理解
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if( nums == null){
            return;
        }
        int j = 0;
        for( int i = 0; i < nums.length; i++){
            if( nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for(int i = j; i<nums.length; i++){
            nums[i] = 0;
        }
        }

    public static void main(String[] args) {

    }
}
