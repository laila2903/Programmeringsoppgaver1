import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave2 {

    public static void alder () {
        String age = showInputDialog("Skriv inn din alder");
        int alder = Integer.parseInt(age);
        String age2 = showInputDialog("Skriv inn din alder");
        int alder2 = Integer.parseInt(age2);
        String age3 = showInputDialog("Skriv inn din alder");
        int alder3 = Integer.parseInt(age3);

        int sum = alder+alder2+alder3;
        int gjennimsnitt = sum/3;

        showMessageDialog(null, "Gjennomsnitt av alderen din er " + gjennimsnitt);
        System.out.println("Gjennomsnitt av alderen din er " + gjennimsnitt);
    }

    public static void desimaler (){

        String innTall1 = showInputDialog("Skriv inn et tall:");
        String innTall2 = showInputDialog("Skriv inn et tall til:");
        String innTall3 = showInputDialog("Skriv inn enda et tall:");
        double tall1, tall2, tall3;
        try {
            tall1 = Double.parseDouble(innTall1);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        }
        catch(Exception e) {
            tall1=0;
            tall2=0;
            tall3=0;
        }
        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum / 3;
        String ut = "Summen av tallene "+tall1+" , "+tall2+" , "+tall3+
                " er "+sum+"\n"+
                "Gjennomsnittet av tallene er "+gjennomsnitt;
        System.out.print(ut);
        showMessageDialog(null,ut);

    }



    public static void main(String[] args) {
        desimaler();
    }
}
