package com.erdincozdemir;

public class AppMain {
    public static void main(String[] args) {

        System.out.println( "------Arithmetic Operators------" );

        System.out.println( "/ + ( Addition )/" );

        int x = 5;
        int y = 3;
        System.out.println(x+y);

        System.out.println( "/ - ( Subtraction )/" );

        int x1 = 5;
        int y1 = 3;
        System.out.println(x1-y1);

        System.out.println( "/ * (Multiplication)/" );

        int x2 = 5;
        int y2 = 3;
        System.out.println(x2*y2);

        System.out.println( "/ / ( Division )/" );

        int x3 = 15;
        int y3 = 3;
        System.out.println(x3/y3);

        System.out.println( "/ % (Modulus)/" );

        int x4 = 5;
        int y4 = 3;
        System.out.println(x4%y4);

        System.out.println( "/ ++ (Increment)/" );

        int x5 = 5;
        ++x5;
        System.out.println(x5);

        System.out.println( "/ -- (Decrement)/" );

        int x6 = 13;
        --x6;
        System.out.println(x6);

        System.out.println( "/ / (Float)/" );

        int x7 = 21;
        int y7 = 4;
        float sonuc = (float) x7 / y7;
        System.out.println(sonuc);

        System.out.println( "------Assignment Operators------" );

        System.out.println( "/ = /" );

        int x8 = 23;
        System.out.println(x8);

        System.out.println( "/ ( += )/" );

        int x9 = 13;
        x9 += 3; //x=x+3
        System.out.println(x9);

        System.out.println( "/ ( -= )/" );

        int x10 = 12;
        x10 -= 5; //x=x-5
        System.out.println(x10);

        System.out.println( "/ ( *= )/" );

        int x11 = 12;
        x11 *= 5;
        System.out.println(x11);

        System.out.println( "/ ( /= )/" );

        int x12 = 12;
        x12 /= 6; //x = x/5
        System.out.println(x12);

        System.out.println( "/ ( %= )/" );
        int x13 = 7;
        x13 %= 3; //x = x % 3
        System.out.println(x13);


        System.out.println( "------Comparison Operators------" );

        System.out.println( "/ ( == )/" );

        int x14 = 5;
        int y14 = 3;
        System.out.println("x14 : "+ x14);
        System.out.println("y14 : "+ y14);
        System.out.println((x14==y14)   ?   "EVET, x14 ve y14 eşittir."  :  "HAYIR, x14 ve y14 eşit değildir.");

        System.out.println( "/ ( != )/" );

        int x15 = 5;
        int y15 = 5;
        System.out.println("x15 : "+ x15);
        System.out.println("y15 : "+ y15);
        System.out.println((x15!=y15)   ?   "EVET, x15 ve y15 eşit değildir."  :  "HAYIR, x15 ve y15 eşittir.");

        System.out.println( "/ ( > )/" );

        int x16 = 5;
        int y16 = 5;
        System.out.println("x16 : "+ x16);
        System.out.println("y16 : "+ y16);
        System.out.println((x16>y16)   ?   "EVET, x16 > y16"  :  "HAYIR, x16 > y16 değildir.");

        System.out.println( "/ ( < )/" );

        int x17 = 3;
        int y17 = 5;
        System.out.println("x17 : "+ x17);
        System.out.println("y17 : "+ y17);
        System.out.println((x17>y17)   ?   "EVET, x17 < y17"  :  "HAYIR, x17 < y17 değildir.");

        System.out.println( "/ ( >= )/" );

        int x18 = 5;
        int y18 = 5;
        System.out.println("x18 : "+ x18);
        System.out.println("y18 : "+ y18);
        System.out.println((x18>=y18)   ?   "EVET"  :  "HAYIR");

        System.out.println( "/ ( <= )/" );

        int x19 = 6;
        int y19 = 5;
        System.out.println("x19 : "+ x18);
        System.out.println("y19 : "+ y18);
        System.out.println((x19<=y19)   ?   "EVET"  :  "HAYIR");

        System.out.println( "------Logical Operators------" );

        System.out.println( "/ ( && ( Logical and ))/" );

        int x20 = 5;
        System.out.println(x20);
        System.out.println((x20<6 && x20>1)   ?   "EVET her iki şartı sağlar"  :  "HAYIR her iki şartı sağlamaz");

        System.out.println( "/ ( || ( Logical or ))/" );

        int x21 = 5;
        System.out.println(x21);
        System.out.println((x21<6 || x20>1)   ?   "EVET en az bir şartı sağlar"  :  "HAYIR iki şartı sağlamaz");

        System.out.println( "/ ( ! ( Logical not ))/" );

        int x22 = 8;
        System.out.println(x22);
        System.out.println(!(x21<6 && x21>1)   ?   "EVET "  :  "HAYIR");
    }
}
