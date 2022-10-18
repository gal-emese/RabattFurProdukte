import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperationenMitRabatt opRab = new OperationenMitRabatt();
        Produkt prod1 = new Produkt(15.54,24);
        Produkt prod2 = new Produkt(15.03,5);
        Produkt prod3 = new Produkt(20.55,19);
        Produkt prod4 = new Produkt(9.55,15);
        Produkt prod5 = new Produkt(120,16);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(prod1);
        produktList.add(prod2);
        produktList.add(prod3);
        produktList.add(prod4);
        produktList.add(prod5);
        List<Produkt> newProduktList = opRab.verwendetRabatt(produktList);
//        for (Produkt p: newProduktList)
//            System.out.println(p.toString());
        List<Produkt> produkte100 = opRab.gibtProdukte100(produktList);
//        for (Produkt p: produkte100)
//            System.out.println(p.toString());
        List<Produkt> newProduktList2 = opRab.gibtSortierteProdukteNachRabatt(produktList);
//        for (Produkt p: newProduktList2)
//            System.out.println(p.toString());
        Produkt prod6 = opRab.gibtTeuersteProdukt(newProduktList2);
        Produkt prod7 = opRab.gibtGunstigeProdukt(newProduktList2);
        System.out.println("Teuerste: \n" + prod6.toString());
        System.out.println("Gunstige: \n" + prod7.toString());




    }
}