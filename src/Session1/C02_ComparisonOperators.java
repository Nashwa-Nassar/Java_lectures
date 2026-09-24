package Session1;

public class C02_ComparisonOperators {
    static void main(String[] args) {

        //System.out.print("Ahmed");
        //System.out.println("Ali");

        int x = 5;
        boolean c =  (x != 5);
        if (c){
            System.out.println("Ahmed");
        }
        else {
            System.out.println("Ali");
        }

        // this line will get printed weather the if conditions are met or not
        // because it is outside their scope
        System.out.println("Nashwa");


    }
}
