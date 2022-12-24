package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
       Offer offer1=new Offer();
       offer1.setInfo("Istanbul","SABIRE","SDET",180000,true,true,true,false);

       Offer offer2=new Offer();
       offer2.setInfo("Ankara","ILKSOY","GM",150000,true,true,true,true);

       Offer offer3=new Offer();
       offer3.setInfo("URUMÇİ","BOGDA","BA",1000000,true,true,false,true);

       Offer offer4=new Offer();
       offer4.setInfo("Kaşgar","APPLE","SDET",100000,true,true,false,false);

       Offer offer5=new Offer();
       offer5.setInfo("AKSU","UYSOFT","GM",1000000,true,true,true,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        Offer[]myOffers={offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime);// remove if the offer is not fulltime
        System.out.println(fullTimeOffers.size());
        System.out.println("==================================");

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!p.location.equals("AKSU"));//removes the offer if the offer is not from local area
        System.out.println(localOffers.size());
        System.out.println("=============================");


    }
}
