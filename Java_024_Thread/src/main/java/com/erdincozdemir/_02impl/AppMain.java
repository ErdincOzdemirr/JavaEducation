package com.erdincozdemir._02impl;

class BasitSinif implements Runnable{

    @Override
    public void run(){
        System.out.println("Thread Çalışıyor" + Thread.currentThread().getName());
        }
    }

public class AppMain {
    public static void main(String[] args) {

        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread Başlıyor");
        Thread thread = new Thread(basitSinif);
        thread.start();

    }
}