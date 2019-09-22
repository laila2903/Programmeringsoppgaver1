import javax.swing.*;

public class Person {

    String fornavn = JOptionPane.showInputDialog(null, "Skriv inn ditt fornavn");
    String etternavn = JOptionPane.showInputDialog(null, "Skriv inn etternavnet diit her");
    String adresse = JOptionPane.showInputDialog(null, "skriv inn adressen her");
    String telefonnummer = JOptionPane.showInputDialog(null, "Skriv inn telefonnummeret");
    public String innfodselaar = JOptionPane.showInputDialog(null, "Skriv inn fødselsåret ditt");

    public int fodear = Integer.parseInt(innfodselaar);

    public int alder(){
        int alder = 2018-fodear;
        return alder;
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        int alder = person1.alder();
        String ut = "Navnet er: "+person1.fornavn+" "+person1.etternavn+"\n"+"Adresse er: "+person1.adresse +"\n"+"Telefonnummer er: "+person1.telefonnummer+"\n"+"Alderen er: "+alder;
        System.out.println(ut);

    }
}
