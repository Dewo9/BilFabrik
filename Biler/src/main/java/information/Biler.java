package information;

public class Biler {
    private String mærke;
    private double motor;
    private String farve;
    private String ejer;

    public Biler(String mærke, double motor, String farve, String ejer){
        this.mærke = mærke;
        this.motor = motor;
        this.farve = farve;
        this.ejer = ejer;
    }


    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public String getEjer() {
        return ejer;
    }

    public void setEjer(String ejer) {
        this.ejer = ejer;
    }

    @Override
    public String toString() {
        return "Mærke: " + mærke + " Motor: " + motor + " Farve: " + farve + " Ejer: " + ejer;
    }
}
