package com.my.fedor.warmup2;

public class Array_1 {

    //Array-1   27	 	 front11
    //Array-1   26       make2
    //Array-1   25      unlucky1
    //Array-1   24      frontPiece

    //Array-1   23      maxTriple
    public int maxTriple(int[] nums) {
        int i = Math.max(nums[nums.length/2], Math.max(nums[0],nums[nums.length-1]));
        return i;

    }
    //Array-1   22      midThree
    //Array-1   21       swapEnds
    //Array-1   20      plusTwo
    //Array-1   19       makeMiddle
    //Array-1   18       biggerTwo
    //Array-1   17       start1
    //Array-1   16      fix23
    //Array-1   15       double23
    //Array-1   14       makeLast
    public int[] makeLast(int[] nums) {
        int[] res= new int [nums.length];
        res[nums.length-1] = nums[ nums.length -1];
        return res;
    }
    //Array-1   13      no23
    //Array-1   12        has23
    //Array-1   11       makeEnds
    //Array-1   10       middleWay
    //Array-1   9       sum2
    //Array-1   8        maxEnd3
    //Array-1   7       reverse3
    //Array-1   6       rotateLeft3
    //Array-1   5      sum3
    //Array-1   4      commonEnd
    //Array-1   3      makePi
    //Array-1   2       sameFirstLast
    //Array-1   1     firstLast6
    public boolean firstLast6(int[] nums) {
    return true;

    }
    public static void main(String[] args) {


    }
}
