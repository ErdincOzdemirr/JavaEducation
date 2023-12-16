package com.erdincozdemir;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.setAdi("Erdinç");
        ogretmen1.setSoyadi("Özdemir");
        ogretmen1.setAdres("Türkiye");
        ogretmen1.setTelefon("1812");
        ogretmen1.setBrans(Brans.Matematik);

        Ogretmen ogretmen2 = new Ogretmen("Hava",
                                        "Ozdemir",
                                        "Türkiye",
                                        "1812",
                                        Brans.SinifOgretmeni );
        List<Ogretmen> ogretmenList = new ArrayList<>();
        ogretmenList.add(ogretmen1);
        ogretmenList.add(ogretmen2);

        System.out.println(ogretmenList);

        System.out.println("----------------------");

        List<Ders> dersList = new ArrayList<>();

        dersList.add(new Ders(Dersler.Geometri, "100", ogretmen1));
        dersList.add(new Ders(Dersler.Matematik, "102", ogretmen1));
        dersList.add(new Ders(Dersler.Yazilim, "108", ogretmen1));
        dersList.add(new Ders(Dersler.Cografya, "205", ogretmen2));
        System.out.println(dersList);

        System.out.println(dersList.get(2).getOgretmen().getAdi());
        System.out.println(dersList.get(2).getOgretmen().getSoyadi());
        System.out.println(dersList.get(2).getOgretmen().getAdres());
        System.out.println(dersList.get(2).getOgretmen().getTelefon());

        for (int i = 0; i < dersList.size(); i++) {
            if (Brans.SinifOgretmeni == dersList.get(i).getOgretmen().getBrans()) {
                System.out.println("Evet SİNİF ÖĞRETMENİ"+i);
            } else {
                System.out.println("Hayır"+i);
            }
        }

        System.out.println("---------For----------");

        for (int i = 0; i < dersList.size(); i++) {
            System.out.println(dersList.get(i));

            if(dersList.get(i).getKodu().equals("108")){
                System.out.print("\tOgretmen Bilgisi: ");
                System.out.println(dersList.get(i).getOgretmen().getAdi()+
                                    dersList.get(i).getOgretmen().getSoyadi());

            };
        }

        System.out.println("-------For Each----------");

        for (Ders ders :  dersList) {
            if(ders.getKodu()=="108"){
                System.out.println(ders.getOgretmen().getAdi()+
                        ders.getOgretmen().getSoyadi());
            }
        }



    }
}
