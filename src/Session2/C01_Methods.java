package Session2;

// writing your code like this helps in reusing the functions.
//  functions here are the methods
public class C01_Methods {
    static void main(String[] args) {

        // functions calling
        printNames();

        printNumbers();

        int result1= add(4, 7);
        System.out.println(result1);

        int result2 = add(3, 5);
        System.out.println(result2);

    }

    // function definitions
    static void printNames(){
        System.out.println("Nashwa");
        System.out.println("Nassar");
    }

    // void means that the function does not return anything
    static void printNumbers(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    //datatype of what the function return (int)
    static int add(int a, int b){
        int res = a + b;
        return res;
        // return is the last thing in a function and once we reach it,
        // it ends the function and get out
    }
}
