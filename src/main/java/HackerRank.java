import java.util.*;

public class HackerRank {

    public static void main(String[] args) {
//        hackerrank assessment questions
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

//
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(4);


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


//        1)
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
//        2)
//you can also use collections.min or max to get these values

//        Collections.sort(arr);
//        long max = arr.get(0);
//        long min = arr.get(arr.size() - 1);
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
//        3)
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
//        5) XOR operator (^) is used to find the unique value.

//        int uniqueInt = 0;
//
//        for(int i = 0; i < arr.size(); i++){
//            uniqueInt ^= arr.get(i);
//        }
//        System.out.println(uniqueInt);
//        ------------------------------------------------------------------------------------------------------
//        6) Given a square matrix, calculate the absolute difference between the sums of its diagonals.

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
//        7) Given an array of  distinct integers, transform the array into a zig zag sequence by permuting the array elements. A sequence will be called a zig zag sequence if the first  elements in the sequence are in increasing order and the last  elements are in decreasing order, where . You need to find the lexicographically smallest zig zag sequence of the given array.
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

//        *) When you need toe create multiple users with values you can use a hashmap and a loop to create
//        int m = 2;
//        int n = 2;
//
//        HashMap<Integer, Integer> towerBreak = new HashMap<Integer, Integer>();
//
//            for(int i = 1; i <= n; i++){
//                towerBreak.put(i, m);
//            }
//       ---------------------------------------------------------------------
//        9) Two players are playing a game of Tower Breakers! Player  always moves first, and both players always play optimally.The rules of the game are as follows:
//
//Initially there are  towers.
//Each tower is of height .
//The players move in alternating turns.
//In each turn, a player can choose a tower of height  and reduce its height to , where  and  evenly divides .
//If the current player is unable to make a move, they lose the game.
//Given the values of  and , determine which player will win. If the first player wins, return . Otherwise, return .

//        public static int towerBreakers(int n, int m) {
//            // Write your code here
//            if(m == 1 || n%2 == 0){
//                return 2;
//            }else{
//                return 1;
//            }
//        }
//-------------------------------------------------------------------------------------------------

//        10) Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

//        By converting the string into a character array you are able to rely on java to find the ASCII number for each letter.

//        String s = "Hello_World!";
//        int k = 4;
//
//        StringBuilder newString = new StringBuilder();
//        for(char character: s.toCharArray()){
//            if(character >= 'a' && character <= 'z'){
//                int alphabetPosition = character - 'a';
//                int newAlphabetPosition = (alphabetPosition + k) %26;
//                char newCharacter = (char) ('a' + newAlphabetPosition);
//                newString.append(newCharacter);
//            }else if(character >= 'A' && character <= 'Z'){
//                int alphabetPosition = character - 'A';
//                int newAlphabetPosition = (alphabetPosition + k) %26;
//                char newCharacter = (char) ('A' + newAlphabetPosition);
//                newString.append(newCharacter);
//            }else{
//                newString.append(character);
//            }
//        }
//        System.out.println(newString.toString());

//        11) Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.

//        create your own sort method for strings, after sorting add the new strings to an array list before looping over them and comparing characters.

//        public static String sort(String s){
//            char[] ch = s.toCharArray();
//            Arrays.sort(ch);
//            return new String(ch);
//        }
//
//        public static String gridChallenge(List<String> grid) {
//            // Write your code here
//            ArrayList<String> gridList = new ArrayList<>();
//            for(int i = 0; i < grid.size(); i++){
//                String s = sort(grid.get(i));
//                gridList.add(s);
//            }
//
//            int size = gridList.get(0).length();
//            for(int i = 1; i < gridList.size(); i++){
//                for(int j = 0; j < size; j++){
//                    if(gridList.get(i-1).charAt(j) > gridList.get(i).charAt(j)){
//                        return "NO";
//                    }
//                }
//            }
//            return "YES";
//        }

//        12) could not find solution for all cases/ some nums exceed data type limits

//        String n = "9875";
//        int k = 4;
//
//        StringBuilder p = new StringBuilder();
//        for(int i = 0; i < k; i++){
//            p.append(n);
//        }
//
//        do{
//            int temp = 0;
//            char[] pArray = p.toString().toCharArray();
//
//            for (int i = 0; i < pArray.length; i++) {
//                temp += Integer.parseInt(String.valueOf(pArray[i]));
//            }
//            p = new StringBuilder(String.valueOf(temp));
//
//        }while(p.length() != 1);
//        System.out.println(p);

//        13)

        int swaps = 0;
        for(int i = arr.size(); i >= 1; i--){
            if(arr.get(i-1) != i){
                if((i - 2) >= 0 && arr.get(i-2) == i){
                    int swap1 = arr.get(i-1);
                    int swap2 = arr.get(i-2);
                    arr.set(i-1,swap2);
                    arr.set(i-2,swap1);
                    swaps++;
                }else if((i - 3) >= 0 && arr.get(i-3) == i){
                    int swap1 = arr.get(i-1);
                    int swap2 = arr.get(i-2);
                    int swap3 = arr.get(i-3);
                    arr.set(i-1,swap3);
                    arr.set(i-2,swap1);
                    arr.set(i-3, swap2);
                    swaps += 2;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swaps);


    }

    }


