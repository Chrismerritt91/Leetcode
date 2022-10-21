import java.util.ArrayList;
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

//    4) You are given the heads of two sorted linked lists list1 and list2. (possible interview question)
//
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.

//    ListNode testNode = new ListNode(0);
//    ListNode currentNode = testNode;
//
//        while(list1 != null && list2 != null){
//
//        if(list1.val < list2.val){
//            currentNode.next = list1;
//            list1 = list1.next;
//        }else{
//            currentNode.next = list2;
//            list2 = list2.next;
//        }
//        currentNode = currentNode.next;
//    }
//         if(list1 != null){
//        currentNode.next = list1;
//        list1 = list1.next;
//    }
//
//         if(list2 != null){
//        currentNode.next = list2;
//        list2 = list2.next;
//    }
//
//         return testNode.next;

//    5) Given the head of a singly linked list, reverse the list, and return the reversed list.

//    ListNode prev = null;
//
//        while(head != null){
//        ListNode nextNode = head.next;
//        head.next = prev;
//        prev = head;
//        head = nextNode;
//    (head moves the focal point through the list and the prev and head.next switch the direction of the pointer)
//    }
//
//        return prev;

//    6) Given the head of a singly linked list, return the middle node of the linked list.
//
//If there are two middle nodes, return the second middle node.
//    (fast moves twice as fast through the list so when it reaches the end the slow pointer will be at the halfway point)

//    ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;

//    *) how to determine if Listnode has a cycle.

//    ListNode slow = head;
//        ListNode fast = head;
//
//        while (slow != fast){
//
//            if(fast == null || fast.next == null){
//                return false
//            }
//
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;

//    7) Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

//     public ListNode intersection(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                return slow;
//            }
//        }
//         return null;
//    }
//
//    public ListNode detectCycle(ListNode head) {
//        if(head == null || head.next == null){
//            return null;
//        }
//        ListNode intersect = intersection(head);
//        if(intersect == null) return null;
//
//        ListNode start = head;
//        while(intersect != start){
//            intersect = intersect.next;
//            start = start.next;
//        }
//        return start;
//    }

//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!DATA STRUCTURE EXERCISES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//    1) Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//    first solution/ higher complexity because it has to loop twice
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i] == nums[j]){
//                    return false;
//                }
//            }
//        }
//        return true;

//        second solution/ only had to loop once, make sure to sort array first
//        Arrays.sort(nums);
//        for(int i = 1; i < nums.length; i++){
//            if(nums[i] == nums[i-1]){
//                return true;
//            }
//        }
//        return false;

//    2) Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//A subarray is a contiguous part of an array.

    //        !!!!!!!!!!!Kadane's Algorithm!!!!!!!!!!
//        int max_sum = nums[0];
//        int current_sum = max_sum;
    //(set the max and current to the first index)
//        for(int i = 1; i < nums.length; i++){
//            current_sum = Math.max(nums[i] + current_sum, nums[i]);
//            max_sum = Math.max(current_sum, max_sum);
    //(we use math.max to set the variables to the larger of the 2 values, first for current we decide if the current index plus the previous sum is larger than the current index and if it is we keep it/and after we set the current sum we check to see if it is larger than our current max sum and at the end the largest sum found is returned)
//        }
//        return max_sum;

//    3) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

    // time complexity n^2/ could be better
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; nums.length; j++) {
//                int complement = target - nums[i];
//
//                if (nums[j] == complement) {
//                    return new int[] {i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("no match found");

    // time complexity n^0

//    Map<Integer, Integer> num_map = new HashMap<>();
//
//    for(int i=0; i<nums.length; i++){
//        int complement = target - nums[i];
//
//        if(num_map.containsKey(complement)){
//            return new int[] {num_map.get(complement), i};
//        }
//        num_map.put(nums[i], i);
//    }
//    throw new IllegalArgumentException("no match found");

//    4) You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

//    int p1 = m-1, p2 = n-1, i = m+n-1;
//        while(p2 >= 0){
//            if(p1 >= 0 && nums1[p1] > nums2[p2]){
//                nums1[i] = nums1[p1];
//                i--;
//                p1--;
//            }else{
//                nums1[i] = nums2[p2];
//                i--;
//                p2--;
//            }
//        }

//    5) Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

//     int length1 = nums1.length;
//       int length2 = nums2.length;
//       int i=0, j=0, k=0;
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//
//       while(i < length1 && j < length2){
//           if(nums1[i] < nums2[j]){
//               i++;
//           }else if(nums1[i] > nums2[j]){
//               j++;
//           }else{
//               nums1[k++] = nums1[i++];
//               j++;
//           }
//        }
//       return Arrays.copyOfRange(nums1,0,k);

//    ***********/Use variables to represent length and index to limit number of loops/******************

//    6) You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//    int  min_val = Integer.MAX_VALUE;
//    int max_profit = 0;
//
//        for(int i = 0; i<prices.length; i++){
//        if(prices[i] < min_val){
//            min_val = prices[i];
//        }else if(prices[i] - min_val > max_profit){
//            max_profit = prices[i] - min_val;
//        }
//    }
//        return max_profit;

//    7) In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//
//You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//
//The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//
//If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

//    int[][] matrixReshape(int[][] mat, int r, int c)
//
//    int rows = mat.length;
//    int columns = mat[0].length;
//
//        if((rows*columns) != (r*c)) return mat;
//
//    int[][] outputArray = new int[r][c];
//    int rowNum = 0;
//    int columnNum = 0;
//
//        for(int i = 0; i<rows; i++){
//        for(int j = 0; j<columns; j++){
//            outputArray[rowNum][columnNum] = mat[i][j];
//            columnNum++;
//            if(columnNum == c){
//                columnNum = 0;
//                rowNum++;
//            }
//        }
//    }
//        return outputArray;

//    8) Given an integer numRows, return the first numRows of Pascal's triangle.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> triangle = new ArrayList<>();
//
//        if (numRows == 0) return triangle;
//
//        List<Integer> firstRow = new ArrayList<>();
//        firstRow.add(1);
//        triangle.add(firstRow);
//
//        for (int i = 1; i < numRows; i++) {
//            List<Integer> prevRow = triangle.get(i - 1);
//            List<Integer> currentRow = new ArrayList<>();
//            currentRow.add(1);
//
//            for (int j = 1; j < i; j++) {
//                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
//            }
//
//            currentRow.add(1);
//            triangle.add(currentRow);
//        }
//        return triangle;
//    }

    public static void main(String[] args) {

//        int[] nums1 = {4,9,5};
//        int[] prices = {7,1,5,3,6,4};



    }
}
