package information;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    Fabrik services = new Fabrik();

    private String mærke;
    private double motor;
    private String farve;
    private String ejer;

    Scanner input = new Scanner(System.in);

    private boolean isRunning = true;
    private int userChoice;

    public void startProgram(){

        System.out.println("Velkommen til min Hobby lommeregner");


        do {

            velkomst();

            try {
                userChoice = Integer.parseInt(input.nextLine());
            } catch (InputMismatchException | NumberFormatException ime) {
                System.out.println("Skal være et tal!");
            }

            switch (userChoice){
                case 1 -> tilføjBil();
                case 2 -> justerBiler();
                case 3 -> fjernBil();
                case 4 -> seBiler();
                case 10 -> stopProgrammet();
            }

        }while (isRunning);

    }

    private void velkomst() {

        System.out.println("""
                1. Tilføj en bil   \s
                2. Rediger en bil           \s
                3. Fjern en bil     \s    
                4. Se biler     
                10. Stop fabrikken
                """);
    }

    private void tilføjBil(){
        System.out.print("Bilens mærke:  ");
        mærke = input.nextLine();

        System.out.print("Bilens motor: ");
        motor = Double.parseDouble(input.nextLine());

        System.out.print("Bilens farve:  ");
        farve = input.nextLine();

        System.out.print("Bilens ejer:  ");
        ejer = input.nextLine();

        services.tilføjBiler(mærke, motor, farve, ejer);

        System.out.println( "Bilen er tilføjet!");

    }

    private void seBiler(){
        System.out.println(services.getBilerArrayList());
    }

    private void justerBiler(){
        System.out.println("Hvilken mærke: ");
        mærke = input.nextLine();

        System.out.println("Bilens nye mærke: ");
        String nyMærke = input.nextLine();

        System.out.println("Bilens nye motor: ");
        double nyMotor = Double.parseDouble(input.nextLine());

        System.out.println("Bilens nye farve: ");
        String nyFarve = input.nextLine();

        System.out.println("Bilens nye ejer: ");
        String nyEjer = input.nextLine();


        services.justerBil(mærke, nyMærke, nyMotor, nyFarve, nyEjer);

        System.out.println("Bilen er hermed blevet ændret!");
    }

    private void fjernBil(){
        System.out.println("Bilens mærke: ");
        mærke = input.nextLine();

        services.fjernEnBil(mærke);
        System.out.println("Bilen er hermed fjernet!");
    }


    private void stopProgrammet() {
        System.out.println("Programmet er hermed stoppet");

        isRunning = false;
    }
}
