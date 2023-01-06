import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRank {

    public static void main(String[] args) {
//        hackerrank assessment questions
//
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(4);
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
//        7)



        }

    }


