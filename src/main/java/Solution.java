import java.util.List;

public class Solution {

// fizzbuzz practice questions
//    1
//    public List<String> fizzBuzz(int n) {
//        List<String> fizzbuzz = new ArrayList<String>();
//        for(int i = 1; i <= n; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                fizzbuzz.add("FizzBuzz");
//            } else if(i % 3 == 0){
//                fizzbuzz.add("Fizz");
//            } else if(i % 5 == 0){
//                fizzbuzz.add("Buzz");
//            } else{
//                fizzbuzz.add(String.valueOf(i));
//            }
//        }
//        return fizzbuzz;
//    }

    //    2) Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i])
    //Return the running sum of nums.

//     public int[] runningSum(int[] nums) {
//        int current = 0;
//       for(int i = 0; i < nums.length; i++){
//                current += nums[i];
//                nums[i] += (current - nums[i]);
//        }
//        return nums;
//    }

//    3) Given an array of integers nums, calculate the pivot index of this array.
//
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//
//Return the leftmost pivot index. If no such index exists, return -1.

//    int total = 0;
//        for(int i = 0; i < nums.length; i++){
//        total += nums[i];
//    }
//
//    int left = 0;
//        for(int i = 0; i < nums.length; i++){
//        if(i != 0) left += nums[i-1];
//        if(total - left - nums[i] == left){
//            return i;
//        }
//    }
//        return -1;



    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        if(s.length() != t.length(){
//            return false;
        }


       char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(char i: sArray){

        }

    }
}
