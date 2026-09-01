package Session1;

public class C08_Arrays {
    static void main(String[] args) {

        // data_type var_name [] = {value1, value2};
        int a[] = {4, 8, 3, 6, 9, 6, 7, 3, 7, 5, 5, 5, 3};  // 6*4 byte

        System.out.println(a[2]);
        System.out.println(a.length);

        int sum = a[0] + a[a.length-1];
        System.out.println(sum);

        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }

        char s[] = {'A', 'B', 'C'};
        String c[] = {"Ahmed", "Nashwa", "Mona"};

    }
}
