package Session1;

public class C03_LogicalOperators {
    static void main(String[] args) {

        int x = 5;
        int y = 10;

        boolean c1 =  !(x != 5);   // ! not operator
        boolean c2 = (y >0);

        if (c1 && c2){
            System.out.println("Ahmed");
            System.out.println("Ibrahiem");
        }
        else if (c1 || c2) {
            System.out.println("Ali");
        }
        else{
            System.out.println("YES");
        }

    }
}
