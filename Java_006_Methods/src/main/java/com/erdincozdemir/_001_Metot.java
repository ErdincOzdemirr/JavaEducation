package com.erdincozdemir;
public class _001_Metot {

    public static void cizgiCiz() { System.out.println("---------------");}

    public static void topla(int a, int b){
       int toplama = a + b;
        System.out.println("toplam = " + toplama);
    }

    public static void kucukBul(int x, int y) {
        if (x>y){
            System.out.println("x, y'den büyük");
        } else if(x<y){
            System.out.println(("x,y'den küçük"));
        } else{
            System.out.println("x = y");
        }
    }
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            cizgiCiz();
        }
        topla(1,2);
        kucukBul(8,12);
    }
}
