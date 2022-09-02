package day1;

/*
Notes:
Binary Search algorithm, reduces time complexity from a Linear Search's O(n) to O(logn)
Works on sorted lists
 */
public class BinarySearch {
    public static void main(String [] args){
        int [] numbers = {1,3,5,6,8,10};
        binarySearchIterative(numbers, 18);
    }

    static void binarySearchIterative(int [] numbers, int key){
        int startIndex = 0;
        int mid;
        int endIndex = numbers.length - 1;
        while (endIndex - startIndex > 1){
            mid = (startIndex + endIndex) / 2;
            if(key > numbers[mid]) startIndex = mid + 1;
            else endIndex = mid;
        }
        if(numbers[startIndex] == key) System.out.println("Found at Index "+startIndex);
        else if(numbers[endIndex] == key) System.out.println("Found at Index "+endIndex);
        else System.out.println("Key not found");
    }
}
