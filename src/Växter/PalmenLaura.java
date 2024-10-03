package Växter;

class PalmenLaura extends VäxtBas {
    public PalmenLaura() {
        super("Palmen Laura");
    }

    @Override
    public void skrivUtVattenbehov() {
        System.out.println("Växtnamn: " + namn + ", Vattenbehov: 2.5 liter kranvatten.");
    }
}