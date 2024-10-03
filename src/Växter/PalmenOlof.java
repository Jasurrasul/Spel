package Växter;

class PalmenOlof extends VäxtBas {
    public PalmenOlof() {
        super("Palmen Olof");
    }

    @Override
    public void skrivUtVattenbehov() {
        System.out.println("Växtnamn: " + namn + ", Vattenbehov: 0.5 liter kranvatten.");
    }
}