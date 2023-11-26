package com.erdincozdemir;

public class _001_For {
    public static void main(String[] args) {

        System.out.println("-----------For-------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        };

        System.out.println("-----------Nested Loops-------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("Ben dış scope dan");
            for (int j = 0; j < 2; j++) {
                System.out.println("    Ben iç scopedan");
            };

        };
        /*
        System.out.println("-----------For SONSUZ DONGU-------------");

        for ( ; ; ) {
            System.out.println("Sonsuz döngü");
        }
		*/




    }
}
