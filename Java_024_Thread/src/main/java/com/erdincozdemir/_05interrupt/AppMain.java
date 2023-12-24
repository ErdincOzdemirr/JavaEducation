package com.erdincozdemir._05interrupt;


public class AppMain {

    public static long sayac = 0;
    public static void main(String[] args) {

        long baslangic = System.currentTimeMillis();

        final var mainThread = Thread.currentThread();

        new Thread(()->{
                    for (int i = 0; i < 100; i++) {
                        sayac++;

                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        System.out.println("Sayac" + sayac);

                        mainThread.interrupt();
                    }
                }).start();

        long bitis = System.currentTimeMillis();

        System.out.println("Geçen zaman : " + (bitis - baslangic));

    }

}
