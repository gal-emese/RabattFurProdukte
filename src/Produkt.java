public class Produkt {
    private double price;
    private int anzahlVonTage;

    public Produkt(double basisPreis, int anzahlVonTage) {
        // wir prufen ob basisPreis Vielfacher von 0.05 ist
        if (basisPreis / 0.05 != (int)(basisPreis / 0.05))
            basisPreis = Math.round((basisPreis / 0.05)) * 0.05;
        this.price = basisPreis;
        this.anzahlVonTage = anzahlVonTage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getAnzahlVonTage() {
        return anzahlVonTage;
    }

    public String toString(){
        return "Preis: " + price + "\nTage: " + anzahlVonTage + "\n";
    }
}
