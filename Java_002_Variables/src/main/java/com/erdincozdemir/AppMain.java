package com.erdincozdemir;

public class AppMain {
    public static void main(String[] args) {
        String aciklama = "Bu ders değişkenleri öğrendik.";

        //Primetive

        byte myByte = 15; //-128 <-> 127
        System.out.println("My byte: " + myByte);
        //byte myByte2 = 128;
        short myShort = 30; //-32,768 <-> 32,767
        System.out.println("My short: " + myShort);
        //short myShort2 = 40000;
        int myInt = 5454; //-2,147,483,648 <-> 2,147,483,647
        System.out.println("My int: " + myInt);
        //int myInt2 = 300000000000000;
        long myLong = 1234567890123456789L; //-9,223,372,036,854,775,808 <-> 9,223,372,036,854,775,807
        System.out.println("My long: " + myLong);
        //long myLong2 = 90000000000000000000L;
        float myFloat = 1.123456f; //-3.4*10^38 <-> 3.4*10^38
        System.out.println("My float: " + myFloat);
        double myDouble = 16235.12312d;
        System.out.println("My double: " + myDouble);
        char myChar = 'E';
        System.out.println("My char: " + myChar);
        boolean myBoolean = true; //false;
        System.out.println("My char: " + myBoolean);

        System.out.println("//------------------------------------//");

        //Non-Primitive

        Byte myByte2 = 12;
        System.out.println("My Byte: " + myByte2);
        Short myShort2 = 123;
        System.out.println("My Short: " + myShort2);
        Integer myInt2 = 540;
        System.out.println("My Integer: " + myInt2);
        Long myLong2 = 35L;
        System.out.println("My Long: " + myLong2);
        Float myFloat2 = 1.23f;
        System.out.println("My Float: " + myFloat2);
        Double myDouble2 = 1.123456789d;
        System.out.println("My Double: " + myDouble2);
        Character myChar2 = 'D';
        System.out.println("My Character: " + myChar2);
        Boolean myBoolean2 = true;
        System.out.println("My Boolean: " + myBoolean2);

        System.out.println("//------------------------------------//");

        String firstName = "Erdinc";
        String lastName = "Ozdemir";
        Integer kilo = 80;
        double boy = 1.75d;

        System.out.println("Adı: " + firstName);
        System.out.println("Soyadı: "+ lastName);
        System.out.println("Kilo: " + kilo);
        System.out.println("Boy: " + boy);

        firstName = "Hava";
        lastName = "Ozdemir";
        kilo = 68;
        boy = 1.75;

        System.out.println("\n\nBoy: " + boy +" - Kilo: "+ kilo + "\n"+ firstName+ " "+lastName);

    }
}
