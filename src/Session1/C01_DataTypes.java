package Session1;

public class C01_DataTypes {
    // this is the entry point of the java program
    static void main(String[] args) {

        // integer numbers
        // definition : data_type var_name = value --> saves a place in memory
        //declaration : byte x;
            byte x = 5;                  // 1 byte --> 8 bits : 255
            short z = 32;                // 2 bytes
            int y = 10;                  // 4 bytes
            long w = 40;                 // 8 bytes
        /* reassign -- overwrite */
            x = 10;

        // arithmetic operators
           //System.out.println(x + z);  // 40
           //System.out.println(x - z);  // -20
           //System.out.println(x * z);  // 300
           //System.out.println(w / x);  // 4
           System.out.println(z % x);  // it returns the rest of the division

        // floating numbers
            float f = 0.3f;
            double q =  30.5;

            q = 40;  //40.0
            f = 0.8f;

       // characters
            char h = 'A'; //2 bytes
            String s = "Nashwa"; // non-primitive, derived data type

        boolean c = true;

        System.out.println(x);
    }
}
