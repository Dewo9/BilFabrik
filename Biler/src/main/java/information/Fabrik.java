package information;

import java.util.ArrayList;

public class Fabrik {

    private String mærke;
    private double motor;
    private String farve;
    private String ejer;

    private ArrayList<Biler> bilerArrayList = new ArrayList<Biler>();

    public void tilføjBiler(String mærke, double motor, String farve, String ejer){
        bilerArrayList.add(new Biler(mærke, motor, farve, ejer));
    }

    public ArrayList<Biler> getBilerArrayList() {
        return bilerArrayList;
    }

    public void justerBil(String mærke, String nyMærke, double nyMotor, String nyFarve, String nyEjer){
        for (Biler bil: bilerArrayList) {
            if (bil.getMærke().contains(mærke)){
                bil.setMærke(nyMærke);
                bil.setMotor(nyMotor);
                bil.setFarve(nyFarve);
                bil.setEjer(nyEjer);
            }
        }
    }

    public void fjernEnBil(String mærke){
        bilerArrayList.removeIf(bil -> bil.getMærke().contains(mærke));
    }
}
