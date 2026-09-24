package Session2;

public class C02_Nesting {

    static void main(String[] args) {

        int x = 6;
        int y = 11;

        /*if (x==5 && y==10){
            System.out.println("Pre");
            System.out.println("Done");
        }*/

        if(x == 5){
            System.out.println("pre");
            if(y == 10){
                System.out.println("Done");
            }
        }

        for(int j=0; j<3; j++)
        {
            System.out.println(j);
            for(int i=0; i<5; i++)
            {
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
