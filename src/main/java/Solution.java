import java.util.HashMap;
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

//    4) Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself

//    String s = "egg";
//    String t = "add";
//
//        if(s.length() != t.length()){
//        return false;
//    }
//
//    HashMap<Character, Character> sMap = new HashMap<>();
//    HashMap<Character, Character> tMap = new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++){
//        char s1 = s.charAt(i);
//        char t1 = t.charAt(i);
//
//      Makes sure the keys and values are both repeating, checks the pattern
//        if(sMap.containsKey(s1)){
//            if(t1 != sMap.get(s1)){
//                return false;
//            }
//        }else{
//      if the first map isnt repeating and the second one is then its false
//            if(tMap.containsKey(t1)){
//                return false;
//            }
//            sMap.put(s1,t1);
//            tMap.put(t1,s1);
//        }
//    }
//        return true;
//}

//    5) Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not)

//    String s = "abc";
//    String t = "ahbgdc";
//
//    int count = 0;
//         for( int i = 0; i < t.length() && count < s.length(); i++){
//        if(s.charAt(count) == t.charAt(i)){
//            count++;
//        }
//    }
//         if(count == s.length()){
//        return true;
//    }
//         return false;


    public static void main(String[] args) {


    }
}
