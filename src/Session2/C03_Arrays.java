package Session2;

public class C03_Arrays {
    static void main(String[] args) {

//        int A[] = {2, 5, 4, 8, 6, 4, 9, 4};
//        System.out.println(A.length);
//        System.out.println(A);
//        for(int k = 0; k<A.length; k++){
//            System.out.println(A[k]);
//        }

        // another way to write an array
        // creates a space in memory then we enter the values
        int b[] = new int[5];

        // two-dimensional array
        // statically in compilation time reserve the values in the memory
        int c[][]= {{4, 8, 2},
                    {3, 9, 2},
                    {10, 0, 9},
                    {4, 5, 8}
                    };
        for (int row = 0; row < c.length; row++){
            for(int col = 0; col < c[row].length; col++){
                System.out.println(c[row][col]);
            }
        }

//        System.out.println(c[2][0]);
//        System.out.println(c.length);
//        System.out.println(c[2].length);
    }
}
