package Växter;

class KöttätandeMeatlof extends VäxtBas {
    public KöttätandeMeatlof() {
        super("Köttätande Meatlof");
    }

    @Override
    public void skrivUtVattenbehov() {
        System.out.println("Växtnamn: " + namn + ", Vattenbehov: 0.24 liter proteindryck.");
    }
}