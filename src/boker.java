import javax.swing.*;

public class boker {

    public String tittel = JOptionPane.showInputDialog("Skriv inn tittelen");
    public String pris = JOptionPane.showInputDialog("Skriv inn prisen");
    public String forfatter = JOptionPane.showInputDialog("Skriv inn forfatter");
    public String iSBN = JOptionPane.showInputDialog("Skriv inn isbn nummer");


    public static void main(String[] args) {
        boker bok1 = new boker();
        String ut = bok1.tittel + " " + bok1.pris + " " + bok1.forfatter + " " + bok1.iSBN;
        JOptionPane.showMessageDialog(null, ut);
    }
}
