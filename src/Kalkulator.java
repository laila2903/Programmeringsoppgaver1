public class Kalkulator {

    public static int addere (int tall1, int tall2){
        int sum = tall1 + tall2;
        return sum;
    }

    public static int subtahere (int tall1, int tall2){
        int sumi = tall1 - tall2;
        return sumi;
    }

    public static int multiplisere (int tall1, int tall2){
        int produkt = tall1 * tall2;
        return produkt;
    }

    public static int dividere (int tall1, int tall2){
        int produkti = tall1 / tall2;
        return produkti;
    }

    public static void main(String[] args) {
        System.out.println("summen er: "+Kalkulator.addere(3,4));
        System.out.println(Kalkulator.subtahere(5,4));
        System.out.println(Kalkulator.multiplisere(3,3));
        System.out.println(Kalkulator.dividere(10,2));
    }

}
