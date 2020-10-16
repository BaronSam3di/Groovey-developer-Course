public class DataTypes {
    public static void main(String[] args){
        // byte;
        // Min Value: -128
        // Max Value: 128
        byte b = 10;
        System.out.println("byte: " + b);

        // Short:
        // Min value: -32,768
        // Max value: 32,768
        short s = 10000;
        System.out.println("short: " + s);
        System.out.println("System.out.println(Short.MAX_VALUE) = " + Short.MAX_VALUE);


        // int:
        // Min Value: -2,147,483,648 ( -2^31)
        // Max Value: 2,147,483,648 ( 2^31)
        int i = 2_147_483_647; // just small enough
        System.out.println("int: " + i);


        // Long:
        // Min Value: -9,223,372,036,854,775,807 (-2^63)
        // Max Value: 9,223,372,036,854,775,807 (-2^63 - 1)
        long mylong = 9223372036_854_775_807L; // Notice the L on the end
        System.out.println("long: " + mylong);


        // Float: 32-bits IEEE floating points (single precision)
        // Min Value: 1.4E-45
        // Max Value: 3.4028235E32
        float myfloat = 1.25F; // notice the F
        System.out.println("float: " + myfloat);

        // double: 64-bits IEEE floating points (double precision)
        // Min Value: 4.9E-324
        // Max Value: 1.7976931348623157E308
        double myDouble = 1.278979;
        System.out.println("double: " + myDouble);

        // char
        char myChar = 'c';
        System.out.println("char: " + myChar);

        // boolean
        boolean myBool = true;
        System.out.println("Boolean: " + myBool);


    }

}

