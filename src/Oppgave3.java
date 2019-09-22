import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Oppgave3 {

    public static void opg1 (){
        String fornavn = JOptionPane.showInputDialog(null, "Skriv inn fornavnet ditt");
        String etternavn = JOptionPane.showInputDialog(null, "Skriv inn etternavnet ditt");
        String innalder = JOptionPane.showInputDialog(null, "Skriv inn din alder");

        int alder = Integer.parseInt(innalder);

        int fodt = 2019 - alder;

        int pensjon = fodt + 67;

        String ut = (fornavn+" "+etternavn+" er idag "+alder+". Hen er født i "+fodt+". I "+pensjon+" er han 67 år og da vil hen være pensjonist");

        JOptionPane.showMessageDialog(null, ut);
    }

    public static void par (){
        int antall = 0;
        antall = antall + 2;
        antall = antall + 2;
        antall = antall + 2;
        antall = antall + 2;
        antall = antall + 2;

        System.out.println(antall);
    }

    public static void areal (){

        String innlengde = JOptionPane.showInputDialog(null, "Skriv inn lengden");
        String innbredde = JOptionPane.showInputDialog(null, "Skriv inn bredden");

        int lengde = Integer.parseInt(innlengde);
        int bredde = Integer.parseInt(innbredde);

        int areal = lengde*bredde;

        String out = "Et rektangel med bredde "+bredde+" cm og lengde "+lengde+" cm har et areal på "+areal+" cm^2.";
        System.out.println(out);
    }

    public static void main(String[] args) {
        areal();

    }

}
