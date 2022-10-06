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

    public static void main(String[] args) {


    }
}
