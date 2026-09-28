package Session2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04_ProblemSolving {
    static void main(String[] args) {
//        // swaping two numbers
//        int x = 5;
//        int y = 8;
//
//        int temp = x;
//        x = y;
//        y = temp;
//
//        System.out.println("x="+x+", y="+y);

        // find element in an array
        int a[] = {4, 8, 3, 2, 7, 9, 3, 2, 1, 5};
//        int index = searchNumber(a, 11);
//        System.out.println(index);

//        Arrays.sort(a);
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);

//        int index = binarySearch(a, 4);
//        System.out.println(index);
        Arrays.sort(a);
        int index = Arrays.binarySearch(a,5);
        System.out.println(index);


    }


    static int searchNumber(int A[], int num) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == num) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int a[], int x){
        Arrays.sort(a);
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        int left = 0;
        int right = a.length-1;

        while(left <= right){
            int mid = (left + right)/2;
            if(a[mid] == x){
                return mid;
            }
            else if (x > a[mid]) {
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }

}



