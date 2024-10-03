package Växter;

abstract class VäxtBas implements Växt {
    protected String namn;

    public VäxtBas(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }
}

