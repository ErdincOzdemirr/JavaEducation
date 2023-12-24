package com.erdincozdemir._01miras;

class BasitSinif extends Thread{

    @Override
    public void run(){
        System.out.println("Thread Çalışıyor" + Thread.currentThread().getName());
        }


    }






public class AppMain {
    public static void main(String[] args) {

        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread Başlıyor");
        basitSinif.start();

    }
}