import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Oppgave1 {


    public static void main(String[] args) {
       String Fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet ditt her");
       String Etternavn = JOptionPane.showInputDialog("Skriv inn ditt etternavn her");
       String alder = JOptionPane.showInputDialog("Skriv inn alderen din");
       String adresse = JOptionPane.showInputDialog("Skriv inn din adresse");
       String poststed = JOptionPane.showInputDialog("Skriv inn poststedet ditt");
       String postnummer = JOptionPane.showInputDialog("Skriv inn postnummeret");

       int Alder = Integer.parseInt(alder);

       String helenavn = Fornavn +" "+ Etternavn;

       //JOptionPane.showMessageDialog(null,helenavn +" bor i "+adresse+" som har postnummer "+postnummer+" i "+poststed+". "+Fornavn+"´s alder er "+Alder+" år.");
        System.out.println(helenavn +" bor i "+adresse+" som har postnummer "+postnummer+" i "+poststed+". "+Fornavn+"´s alder er "+Alder+" år.");
    }
}
