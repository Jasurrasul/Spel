package Växter;

class KaktusenIgge extends VäxtBas {
    public KaktusenIgge() {
        super("Kaktusen Igge");
    }

    @Override
    public void skrivUtVattenbehov() {
        System.out.println("Växtnamn: " + namn + ", Vattenbehov: 2 cl mineralvatten.");
    }
}