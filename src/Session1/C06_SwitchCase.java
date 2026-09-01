package Session1;

public class C06_SwitchCase {
    static void main(String[] args) {

        int day = 6;
        switch (day) {
            case 5:
                System.out.println("Today is Sunday");
            case 6:
                System.out.println("Today is Saturday");
                //break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}
