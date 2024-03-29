import java.util.*;

public class HackerRankChallenges {

//    public static void main(String[] args) {
//        hackerrank assessment questions
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

//
//        List<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(20);
//        arr.add(20);
//        arr.add(10);
//        arr.add(10);
//        arr.add(30);
//        arr.add(50);
//        arr.add(10);
//        arr.add(20);


//        *****  Setting up a 2d array  *****
//        int vertexCount = 3;
//        List<List<Integer>> arr = new ArrayList<>(vertexCount);
//
//        for(int i=0; i < vertexCount; i++) {
//            arr.add(new ArrayList());
//        }
//
//        arr.get(0).add(1);
//        arr.get(0).add(2);
//        arr.get(0).add(3);
//        arr.get(1).add(4);
//        arr.get(1).add(5);
//        arr.get(1).add(6);
//        arr.get(2).add(9);
//        arr.get(2).add(8);
//        arr.get(2).add(9);


//        1)Plus Minus/ Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.
//
//        double size = arr.size();
//        double percentage = 1/size;
//        double positive = 0;
//        double negative = 0;
//        double zero = 0;
//
//        for(int i = 0; i < arr.size(); i++){
//            if(arr.get(i) < 0){
//                negative += percentage;
//            }else if(arr.get(i) > 0){
//                positive += percentage;
//            }else if(arr.get(i) == 0){
//                zero += percentage;
//            }
//        }
//        System.out.println(String.format("%.6f",positive));
//        System.out.println(String.format("%.6f",negative));
//        System.out.println(String.format("%.6f",zero));
//        ------------------------------------------------------------------------------------------------------
//        2)Mini-Max Sum/ Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.


//        long max = Collections.max(arr);
//        long min = Collections.min(arr);
//        long total = 0;
//
//        for(int i = 0; i < arr.size(); i++){
//            total += arr.get(i);
//        }
//
//        System.out.print(total - max);
//        System.out.print(" ");
//        System.out.print(total - min);
//        ------------------------------------------------------------------------------------------------------
//        3) Time Conversion
//        convert any given time to military time
//        String s = "04:59:59AM";
//        String[] stringArr = s.split(":");
//
//        String hours = stringArr[0];
//        String minutes = stringArr[1];
//        String seconds = stringArr[2];
//
//        if(seconds.contains("PM") && Integer.parseInt(hours) < 12){
//            hours = String.valueOf(Integer.parseInt(hours) + 12);
//        }
//        if(seconds.contains("AM") && hours.equals("12")){
//            hours = "00";
//        }
//
//        String militaryTime = hours + ":" + minutes + ":" + seconds.substring(0,2);
//
//        System.out.println(militaryTime);
//        ------------------------------------------------------------------------------------------------------
//        4)
//        find the median of an array

//        Collections.sort(arr);
//        int n = arr.size();
//
//        for(int i = 0, j = n-1; i < n && j > 0; i++, j--){
//            if(i == j){
//                System.out.println(i);
//            }
//        }
//        ------------------------------------------------------------------------------------------------------
//        5) Lonely Integer/ XOR operator (^) is used to find the unique value.

//        int uniqueInt = 0;
//
//        for(int i = 0; i < arr.size(); i++){
//            uniqueInt ^= arr.get(i);
//        }
//        System.out.println(uniqueInt);

//        **------------- Secondary solution to problem 5----------------------------------------------

//        if(arr.size() == 1){
//            System.out.println(arr.get(0));
//        }
//
//        int uniqueInt = 0;
//
//        Collections.sort(arr);
//        for(int i = 1; i < arr.size()-1; i++) {
//
//            if (arr.get(i - 1) < arr.get(i) && arr.get(i) < arr.get(i + 1)) {
//                uniqueInt = arr.get(i);
//                break;
//            }else{
//                uniqueInt = arr.get(arr.size()-1);
//            }
//        }
//            System.out.println(uniqueInt);
//        ------------------------------------------------------------------------------------------------------
//        6)Diagonal Difference/ Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//        1 2 3
//        4 5 6
//        9 8 9

//        int primaryDiagonal = 0;
//        int secondaryDiagonal = 0;
//        int diagonalDifference = 0;
//
//        for(int i = 0; i < arr.get(0).size(); i++){
//                primaryDiagonal += arr.get(i).get(i);
//        }
//        for(int i = arr.get(0).size()-1, j = 0; i >= 0 && j < arr.get(0).size(); i--, j++){
//                secondaryDiagonal += arr.get(i).get(j);
//        }
//
//        if(primaryDiagonal > secondaryDiagonal){
//            diagonalDifference = (primaryDiagonal - secondaryDiagonal);
//        }else{
//            diagonalDifference = (secondaryDiagonal - primaryDiagonal);
//        }
//
//        System.out.println(diagonalDifference);
//        ------------------------------------------------------------------------------------------------------
//        7) Zig Zag Sequence/ Given an array of  distinct integers, transform the array into a zig zag sequence by permuting the array elements. A sequence will be called a zig zag sequence if the first  elements in the sequence are in increasing order and the last  elements are in decreasing order, where . You need to find the lexicographically smallest zig zag sequence of the given array.
//
//    public static void findZigZagSequence(int [] a, int n){
//        Arrays.sort(a);
//        int mid = (n + 1)/2 - 1;
//        int temp = a[mid];
//        a[mid] = a[n - 1];
//        a[n - 1] = temp;
//
//        int st = mid + 1;
//        int ed = n - 2;
//        while(st <= ed){
//            temp = a[st];
//            a[st] = a[ed];
//            a[ed] = temp;
//            st = st + 1;
//            ed = ed - 1;
//        }
//        for(int i = 0; i < n; i++){
//            if(i > 0) System.out.print(" ");
//            System.out.print(a[i]);
//        }
//        System.out.println();
//    }
//}

//------------------------------------------------------------------------------------------

//        *) When you need to create multiple users with values you can use a hashmap and a loop to create
//        int m = 2;
//        int n = 2;
//
//        HashMap<Integer, Integer> towerBreak = new HashMap<Integer, Integer>();
//
//            for(int i = 1; i <= n; i++){
//                towerBreak.put(i, m);
//            }
//       ---------------------------------------------------------------------
//        9)Tower Breakers/ Two players are playing a game of Tower Breakers! Player  always moves first, and both players always play optimally.The rules of the game are as follows:
//
//Initially there are  towers.
//Each tower is of height m.
//The players move in alternating turns.
//In each turn, a player can choose a tower of height x and reduce its height to y, where 1 <= y <= x  and y evenly divides x.
//If the current player is unable to make a move, they lose the game.
//Given the values of n and m, determine which player will win. If the first player wins, return 1. Otherwise, return 2.

//        public static int towerBreakers(int n, int m) {
//            // Write your code here
//            if(m == 1 || n%2 == 0){
//                return 2;
//        *if the number of towers is even then player 2 will always win, if the height is 1 then player 1 can't do anything and player 2 wins
//            }else{
//                return 1;
//        *all other situations player 1 wins
//            }
//        }
//-------------------------------------------------------------------------------------------------

//        10)Caesar Cipher/  Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

//        By converting the string into a character array you are able to rely on java to find the ASCII number for each letter.

//        String s = "Hello_World!";
//        int k = 4;
//
//        StringBuilder newString = new StringBuilder();
//        *use string builder to create new string with loop
//        for(char character: s.toCharArray()){
//        *Convert string into character array while looping
//            if(character >= 'a' && character <= 'z'){
//                int alphabetPosition = character - 'a';
//        *by subtracting a from the character you get the position of the character in the alphabet
//                int newAlphabetPosition = (alphabetPosition + k) %26;
//        * once you apply the change to the position you modulus the number by 26 to catch the number if it goes past 26 when it changes, so 29 would be c
//                char newCharacter = (char) ('a' + newAlphabetPosition);
//        *create a new char variable to convert the value back into a character by casting it
//                newString.append(newCharacter);
//        * append it back to the string
//            }else if(character >= 'A' && character <= 'Z'){
//                int alphabetPosition = character - 'A';
//                int newAlphabetPosition = (alphabetPosition + k) %26;
//                char newCharacter = (char) ('A' + newAlphabetPosition);
//                newString.append(newCharacter);
//            }else{
//                newString.append(character);
//        *if the character is not in the alphabet then it is not changed and is appended to the new string
//            }
//        }
//        System.out.println(newString.toString());
//----------------------------------------------------------------------------------------------

//        11)Grid Challenge/  Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.

//        create your own sort method for strings, after sorting add the new strings to an array list before looping over them and comparing characters.

//        public static String sort(String s){
//            char[] ch = s.toCharArray();
//            Arrays.sort(ch);
//            return new String(ch);
//        }
//        * sort individual strings

//        public static String gridChallenge(List<String> grid) {
//
//            ArrayList<String> gridList = new ArrayList<>();
//            for(int i = 0; i < grid.size(); i++){
//                String s = sort(grid.get(i));
//                gridList.add(s);
//        *create a new array list and sort each string then add string to array list
//            }
//
//            int size = gridList.get(0).length();
//            for(int i = 1; i < gridList.size(); i++){
//        * set the length as a variable, start first loop at index one so we can compare string to previous string so we dont go out of bounds
//                for(int j = 0; j < size; j++){
//                    if(gridList.get(i-1).charAt(j) > gridList.get(i).charAt(j)){
//                        return "NO";
//        *if the previous string with characters in the same position is greater, then strings are not in order, because the char value is be compared and if the value is higher, then the number is farther along in the alphabet
//                    }
//                }
//            }
//            return "YES";
//        }
//------------------------------------------------------------------------------------------
//        **12) could not find solution for all cases/ some nums exceed data type limits

//        String n = "9875";
//        int k = 4;
//
//         if(n == "0"){
//        return 0;
//    }
//    StringBuilder p = new StringBuilder();
//        for(int i = 0; i < k; i++){
//            p.append(n);
//        }
//
//        do{
//            long temp = 0;
//            char[] pArray = p.toString().toCharArray();
//
//            for (long i = 0; i < pArray.length; i++) {
//                temp += Long.parseLong(String.valueOf(pArray[(int)i]));
//            }
//            p = new StringBuilder(String.valueOf(temp));
//
//        }while(p.length() != 1);
//        return Integer.parseInt(p.toString());

//        -----------------------------------------------------------------------------------------------
//        13)New Year Chaos/ It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from  to . Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.
//
//Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

//        int swaps = 0;
//        for(int i = arr.size(); i >= 1; i--){
//       *start at the end and check as you decrement
//            if(arr.get(i-1) != i){
//        *if the number does not equal its position in the array run if else if
//                if((i - 2) >= 0 && arr.get(i-2) == i){
//                    int swap1 = arr.get(i-1);
//                    int swap2 = arr.get(i-2);
//                    arr.set(i-1,swap2);
//                    arr.set(i-2,swap1);
//                    swaps++;
//        *if the number is one position away then target the values and swap for correct position, swaps++
//                }else if((i - 3) >= 0 && arr.get(i-3) == i){
//                    int swap1 = arr.get(i-1);
//                    int swap2 = arr.get(i-2);
//                    int swap3 = arr.get(i-3);
//                    arr.set(i-1,swap3);
//                    arr.set(i-2,swap1);
//                    arr.set(i-3, swap2);
//                    swaps += 2;
//        *if the number is 2 digits away from position then swap all values in between to proper order, swaps++
//                } else {
//                    System.out.println("Too chaotic");
//                    return;
//        *if the position is more than 2 positions away then it is too chaotic so break loop or return
//                }
//            }
//        }
//        System.out.println(swaps);
//        *once all numbers are in proper position sout how many swaps occured

//        ---------------------------------------------------------------------------------------------
//        14) Counting Sort 1/ Another sorting method, the counting sort, does not require comparison. Instead, you create an integer array whose index range covers the entire range of values in your array to sort. Each time a value occurs in the original array, you increment the counter at that index. At the end, run through your counting array, printing the value of each non-zero valued index that number of times.


//        int[] countArr = new int[100];
//        Arrays.fill(countArr, 0);
//        for(Integer a: arr){
//            countArr[a]++;
////           * while looping through the numbers in the arr array when the number equals an index that value will increment
//        }
//        List<Integer> results = new ArrayList<>();
//        for(int i = 0; i < 100; i++){
//            results.add(countArr[i]);
////            * this will convert our array into a list for proper return type
//        }
//        return results;
//---------------------------------------------------------------------------------------------

//        15) Merge 2 sorted linked lists/ Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list. Either head pointer may be null meaning that the corresponding list is empty.
//        Complete the mergeLists function in the editor below.
//        mergeLists has the following parameters:
//        SinglyLinkedListNode pointer headA: a reference to the head of a list
//        SinglyLinkedListNode pointer headB: a reference to the head of a list
//        Returns
//        SinglyLinkedListNode pointer: a reference to the head of the merged list

//        SinglyLinkedListNode testNode = new SinglyLinkedListNode(0);
//        SinglyLinkedListNode currentNode = testNode;
//
//        while(head1 != null && head2 != null){
//
//        if(head1.data < head2.data){
//            currentNode.next = head1;
//            head1 = head1.next;
//        }else{
//            currentNode.next = head2;
//            head2 = head2.next;
//        }
//    * /determines which int is bigger and places that int at the first position, then increments the list that had the larger int to compare next./
//        currentNode = currentNode.next;
//    }
//         if(head1 != null){
//        currentNode.next = head1;
//        head1 = head1.next;
//    }
//
//         if(head2 != null){
//        currentNode.next = head2;
//        head2 = head2.next;
//    }
//      * /this catches if the digit is null so the code does not break/
//         return testNode.next;
//----------------------------------------------------------------------------------------------------
//        16) Queue using 2 stacks/ A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.
//
//A basic queue has the following operations:
//
//Enqueue: add a new element to the end of the queue.
//Dequeue: remove the element from the front of the queue and return it.
//In this challenge, you must first implement a queue using two stacks. Then process q queries, where each query is one of the following 3 types:
//
//1 x: Enqueue element x into the end of the queue.
//2: Dequeue the element at the front of the queue.
//3: Print the element at the front of the queue.

//        Scanner scanner = new Scanner(System.in);
//        int q = scanner.nextInt();
//
//        ArrayList<Integer> input = new ArrayList<>();
//        do{
//            int inputNum = scanner.nextInt();
//            if(inputNum == 1){
//                continue;
//            }else if(inputNum != 2 && inputNum != 3){
//                input.add(inputNum);
//            }else if(inputNum == 2){
//                input.remove(0);
//            }else if(inputNum == 3){
//                System.out.println(input.get(0));
//            }
//            q--;
//        }while(q > 0);
//        -------------------------------------------------------------------------------------------
//        17) Balanced Brackets/ A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
//
//Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().
//
//A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
//
//By this logic, we say a sequence of brackets is balanced if the following conditions are met:
//
//It contains no unmatched brackets.
//The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
//Given n strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.

//        String s = "{(([])[])[]}";
//
//        Stack<Character> stack = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
//                stack.push(s.charAt(i));
////                * use push to add elements to the stack in order of occurence
//            }else{
//                if(stack.isEmpty()){
//                    System.out.println("NO");
////                    * this is to catch if any end braces have occurred first
//                }else{
//                    char popVal = stack.pop();
//                    if(s.charAt(i) == ')' && popVal !='('){
//                        System.out.println("NO");
//                    }else if(s.charAt(i) == '}' && popVal !='{'){
//                        System.out.println("NO");
//                    }else if(s.charAt(i) == ']' && popVal !='['){
//                        System.out.println("NO");
//                    }
////                    * then you take the value of the most recent opening brace and compare it to closing brace, if they do not make a set then you return no
//                }
//            }
//        }
//
//        if(stack.isEmpty()){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//        * if all were matching sets then the stack should be empty, if the stack isnt empty then the brackets were not balanced

//--------------------------------------------------------------------------------------------------
//        18) Simple Text Editor/ Come back to finish, 4 is incomplete
//        System.out.println("How many test cases?");
//        Scanner scanner = new Scanner(System.in);
//        int q = scanner.nextInt();
//        String ghost = scanner.nextLine();
//
//        Stack<String> qList = new Stack<>();
//        StringBuffer S = new StringBuffer();
//
//        for(int i = 0; i < q; i++) {
//            int c = scanner.nextInt();
//            if (c == 1) {
//                String newStr = scanner.next();
//                qList.push(c + " " + newStr);
//                S.append(newStr);
//            } else if (c == 2) {
//                int num = scanner.nextInt();
//                S.delete(S.length() - (num), S.length());
//                qList.push(c + " " + num);
//            } else if (c == 3) {
//                int num2 = scanner.nextInt()-1;
//                System.out.println(S.charAt(num2));
//            } else if(c == 4){
//                String popVal = qList.pop();
//                if(popVal.charAt(0) == '1'){
//                    int subNum = popVal.length()-2;
//                    S.delete(S.length() - (subNum), S.length());
//                } else{
//                    String newStr;
//                    for(int j = qList.size()-1; j>0; j--){
//                        if(qList.get(i).charAt(0) == '1'){
//                            newStr = qList.get(i).trim().substring(1);
//                            String newSub = newStr.substring(0, newStr.length()-(popVal.trim().charAt(1)));
//                            S.append(newSub);
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(S.toString().replaceAll("\s", ""));
//        System.out.println(qList);

//        -----------------------------------------------------------------------------------

//        19) Sparse Arrays/ There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
//        Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.
//
//        matchingStrings has the following parameters:
//
//        string strings[n] - an array of strings to search
//        string queries[q] - an array of query strings
//        Returns
//
//        int[q]: an array of results for each query

//        int arrayCount = queries.size();
//        int[] results = new int[arrayCount];
//        Arrays.fill(results, 0);
//        int index = 0;
//        for(String query: queries){
//            for(String string: strings){
//                if(string.equals(query)){
//                    results[index]++;
//                }
//            }
//            index++;
//        }
//        ArrayList<Integer> resultList = new ArrayList<>();
//        for(int i=0; i < results.length; i++){
//            resultList.add(results[i]);
//        }
//        return resultList;

//        create an int array with a length matching the length of the queries list, set all values to zero with fill(), then loop through queries with a nested loop going through the string list, create an index variable, if the string matches the query then increment the count on results at the current index, once the list of strings is looped increment index variable and go to the next query, transfer array to arraylist and return arraylist.

//        ----------------------------------------------------------------------------------------

//        20) Flipping bits/ Function Description
//
//Complete the flippingBits function in the editor below.
//
//flippingBits has the following parameter(s):
//
//int n: an integer
//Returns
//
//int: the unsigned decimal integer result
//Input Format
//
//The first line of the input contains q, the number of queries.
//Each of the next q lines contain an integer, n, to process.

//        long n = 1;
//
//        String binaryString = Long.toBinaryString(n);
//        binaryString = String.format("%32s", binaryString).replaceAll(" ", "0");
//        System.out.println(binaryString);
//
//        char[] binaryArray = binaryString.toCharArray();
//        for(int i = 0; i < binaryString.length(); i++){
//            if(binaryArray[i] == '0'){
//                binaryArray[i] = '1';
//            }else if(binaryArray[i] == '1'){
//                binaryArray[i] = '0';
//            }
//        }
//        StringBuilder newStr = new StringBuilder();
//        for(char c: binaryArray){
//            newStr.append(c);
//        }
//        String newBinary = newStr.toString();
//        long result = Long.parseLong(newBinary,2);
//        System.out.println(result);

//----------------------------------------------------------------------------------------------

//        21) Pangrams/ Function Description
//
//Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.
//pangrams has the following parameter(s):
//string s: a string to test
//Returns
//string: either pangram or not pangram
//Input Format
//A single line with string s.

//        if(s.length() < 26){
//            return "not pangram";
//        }
//        s = s.toLowerCase();
//        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//        for(String a: alphabet){
//            if(!s.contains(a)){
//                return "not pangram";
//            }
//        }
//        return "pangram";

//        -----------------------------------------------------------------------------------------

//        22) Permuting 2 arrays/ Function Description
//
//Complete the twoArrays function in the editor below. It should return a string, either YES or NO.
//twoArrays has the following parameter(s):
//int k: an integer
//int A[n]: an array of integers
//int B[n]: an array of integers
//Returns
//- string: either YES or NO
//Input Format
//The first line contains an integer q, the number of queries.
//The next q sets of 3 lines are as follows:
//The first line contains two space-separated integers n and k, the size of both arrays A and B, and the relation variable.
//The second line contains n space-separated integers A[i].
//The third line contains n space-separated integers B[i].

//        Collections.sort(A);
//        Collections.sort(B);
//        Collections.reverse(B);
//        if(A.size() != B.size()){
//            return "NO";
//        }
//
//        for(int i = 0; i < A.size(); i++){
//            if(A.get(i) + B.get(i) < k){
//                return "NO";
//            }
//        }
//        return "YES";

//------------------------------------------------------------------------------------------

//        23) Subarray Division 1/Function Description
//Complete the birthday function in the editor below.
//birthday has the following parameter(s):
//int s[n]: the numbers on each of the squares of chocolate
//int d: Ron's birth day
//int m: Ron's birth month
//Returns
//int: the number of ways the bar can be divided
//Input Format
//The first line contains an integer n, the number of squares in the chocolate bar.
//The second line contains n space-separated integers s[i], the numbers on the chocolate squares where 0 <= i < n.
//The third line contains two space-separated integers, d and m, Ron's birth day and his birth month.

//        if(s.size() < m){
//            return 0;
//        }
//
//        int results = 0;
//
//        for(int i = 0; i < s.size(); i++){
//            if((i+m) <= s.size()){
//                int total = 0;
//                List<Integer> sub = new ArrayList<>();
//                sub = s.subList(i, (i+m));
//                for(int j = 0; j < sub.size(); j++){
//                    total += sub.get(j);
//                }
//                if(total == d){
//                    results++;
//                }
//            }
//        }
//        return results;

//        ----------------------------------------------------------------------------------------

//        24) XOR String 2/ Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
//Debug the given function strings_xor to find the XOR of the two given strings appropriately.
//Input Format
//The input consists of two lines. The first line of the input contains the first string, s, and the second line contains the second string, t.
//        Print the string obtained by the XOR of the two input strings in a single line.

//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        String t = scanner.nextLine();
//
//        StringBuffer newStr = new StringBuffer();
//        for(int i = 0; i < s.length(); i++){
//            int xorVal = Integer.valueOf(s.charAt(i)) ^ Integer.valueOf(t.charAt(i));
//            newStr.append(xorVal);
//        }
//
//        String xorStr = newStr.toString();
//
//        System.out.println(xorStr);

//        * answer was correct in proper type according to the description, hackerrank results with wrong answer/ resubmit later to test again

//        ----------------------------------------------------------------------------------------

//        25)Sales by March/ There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//        Function Description
//        sockMerchant has the following parameter(s):
//        int n: the number of socks in the pile
//        int ar[n]: the colors of each sock
//        Returns
//        int: the number of pairs

//        int n = 9;
//
//        Collections.sort(arr);
//        int results = 0;
//        int count = 0;
//
//        for (int i = 0; i < arr.size();){
//            count = 0;
//            for(int j = 0; j < arr.size();j++){
//                if(arr.get(i) == arr.get(j)){
//                    count++;
//                }
//            }
//            results += count/2;
//            i += count;
//        }
//
//        System.out.println(results);

//        -----------------------------------------------------------------------------------------

//        26) Drawing book/ A teacher asks the class to open their books to a page number. A student can either start turning pages from the front of the book or from the back of the book. They always turn pages one at a time. When they open the book, page 1 is always on the right side:
//        When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is n pages long, and a student wants to turn to page p, what is the minimum number of pages to turn? They can start at the beginning or the end of the book.
//        Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page p.

//        int frontCount = p/2;
//        int rearCount = (n-p)/2;
//
//        if(n%2==0 && p%2!=0){
//            rearCount++;
//        }
//
//        if(frontCount > rearCount){
//            return rearCount;
//        }else{
//            return frontCount;
//        }

//        ----------------------------------------------------------------------------------------

//        27) MAX MIN/ You will be given a list of integers, arr, and a single integer k. You must create an array of length k from elements of arr such that its unfairness is minimized. Call that array sub. Unfairness of an array is calculated as arr[MAX] - arr[MIN]
//        Function Description
//        Complete the maxMin function in the editor below.
//        maxMin has the following parameter(s):
//        int k: the number of elements to select
//        int arr[n]:: an array of integers
//        Returns
//        int: the minimum possible unfairness.

//        Collections.sort(arr);
//        List<Integer> sub = new ArrayList<Integer>();
//        int result = 0;
//        for(int i = 0; i<arr.size(); i++){
//            if((i+k) <= arr.size()){
//                sub = arr.subList(i, i+k);
//                int max = sub.get(k-1);
//                int min = sub.get(0);
//                int difference = max - min;
//                if(result == 0)result = difference;
//                if(difference < result){
//                    result = difference;
//                }
//            }
//        }
//        return result;

//        ----------------------------------------------------------------------------------------

//        28) Dynamic Array/ explanation confusing look up by name

//        List<List<Integer>> arr = new ArrayList<>(n);
//        for(int i = 0; i < n; i++){
//            arr.add(new ArrayList<>());
//        }
//        int lastAnswer = 0;
//        List<Integer> results = new ArrayList<>();
//
//        for(int i = 0; i < queries.size(); i++){
//            List<Integer> q = queries.get(i);
//
//            if(q.get(0) == 1){
//                arr.get((q.get(1)^lastAnswer)%n).add(q.get(2));
//            }else{
//                List<Integer> seq = arr.get((q.get(1)^lastAnswer)%n);
//                lastAnswer = seq.get(q.get(2) % seq.size());
//                results.add(lastAnswer);
//            }
//        }
//        return results;



//    }

    }


