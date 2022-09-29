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

    public static void main(String[] args) {

//        int[] nums = {1,7,3,6,5,6};
//        int pivot = 0;
//        int left = nums[0];
//        int right = nums[nums.length - 1];
//        int dec = 1;
//        for(int i = 1; i < nums.length; i++){
//            if(left < right){
//                left += nums[i];
//            }else if(right < left){
//                right += nums[nums.length - dec];
//                dec++;
//            } else if(left == right){
//                pivot = nums[i-1];
//            }
//        }
//        return pivot;
    }
}
