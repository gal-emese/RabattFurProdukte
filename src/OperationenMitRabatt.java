import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OperationenMitRabatt {
    List<Produkt> verwendetRabatt (List<Produkt> produktList){
        List<Produkt> produktListNachRabatt = new ArrayList<>();
        int tage;
        for(Produkt p: produktList) {
            tage = p.getAnzahlVonTage();
            if (tage > 20) {
                // 20 % Rabatt -> 80% der Preis
                Produkt prod = new Produkt(p.getPrice() * 0.8, p.getAnzahlVonTage());
                produktListNachRabatt.add(prod);
            }
            else if (tage >= 10)
            {
                // 10 % Rabatt -> 90% der Preis
                Produkt prod = new Produkt(p.getPrice() * 0.9, p.getAnzahlVonTage());
                produktListNachRabatt.add(prod);
            }
            else
            {
                Produkt prod = new Produkt(p.getPrice(), p.getAnzahlVonTage());
                produktListNachRabatt.add(prod);
            }
        }
        return produktListNachRabatt;
    }

    List<Produkt> gibtProdukte100 (List<Produkt> produktList){
        List<Produkt> produktList100 = new ArrayList<>();
        for(Produkt p: produktList){
            if(p.getPrice() > 100)
                produktList100.add(p);
        }
        return produktList100;
    }

    List<Produkt> gibtSortierteProdukteNachRabatt(List<Produkt> produktList){
        List<Produkt> sortierteProdukte =  verwendetRabatt(produktList);
        int minIndex;
        for (int index=0; index < sortierteProdukte.size(); index++)
        {
            minIndex=index;
            for (int j=index+1; j < sortierteProdukte.size(); j++)
                if (sortierteProdukte.get(j).getPrice() < sortierteProdukte.get(minIndex).getPrice())
                    minIndex=j;
            Collections.swap(sortierteProdukte,index,minIndex);
        }
        return sortierteProdukte;
    }

    Produkt gibtTeuersteProdukt(List<Produkt> produktList){
        int maxIndex=0;
        for(int i=1; i<produktList.size(); i++)
            if (produktList.get(i).getPrice() > produktList.get(maxIndex).getPrice())
                maxIndex = i;
        return produktList.get(maxIndex);
    }

    Produkt gibtGunstigeProdukt(List<Produkt> produktList){
        int minIndex=0;
        for(int i=1; i<produktList.size(); i++)
            if (produktList.get(i).getPrice() < produktList.get(minIndex).getPrice())
                minIndex = i;
        return produktList.get(minIndex);
    }
}
