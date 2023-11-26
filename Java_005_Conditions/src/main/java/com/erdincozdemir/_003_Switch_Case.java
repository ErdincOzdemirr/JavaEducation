package com.erdincozdemir;
import java.util.Scanner;
public class _003_Switch_Case {
    public static void main(String[] args) {

        char harf = 'A';

        switch (harf){
            case 'A':
                System.out.println("Girilen Harf : "+harf);
                break;
            case 'B':
                System.out.println("Girilen Harf : "+harf);
                break;
            case 'C':
                System.out.println("Girilen Harf : "+harf);
                break;
            default:
                System.out.println("Girilen Harf : "+harf);
                break;
        }

        System.out.println("------------------------");

        Scanner scanner = new Scanner(System.in);
        int gunSirasi;

        do {

            System.out.print("Lütfen gün sırasını girin (1-7): ");
            gunSirasi = scanner.nextInt();

            if (gunSirasi < 1 || gunSirasi > 7) {
                System.out.println("Yanlış değer girdiniz. Lütfen 1-7 arası değer giriniz.");
            }
        } while (gunSirasi < 1 || gunSirasi >7);


        switch (gunSirasi) {
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Carşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Bulunamadı.");
                break;
        }
        


        System.out.println("------------------------");

        
        int haftaninGunu;
        haftaninGunu = gunSirasi;

        String mesaj = switch (haftaninGunu) {
            case 1, 2, 3, 4, 5 -> "Tam gün çalış";
            case 6 -> "Yarım gün çalış";
            case 7 -> "Tatil yap";
            default -> "Bilinmeyen gün";
        };
        System.out.println(mesaj);

        scanner.close();
    }
    
}
