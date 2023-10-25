// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Kursus k1 = new Kursus(1, "Æbletogt", 20, "Torsdag", "10.30-14.30");
        //System.out.println(k1);
        Studerende s1=new Studerende(1,"Rasmus","Klump","Ørnegade 3","+4545454545");

         k1.tilfoejStuderende(s1);
        // System.out.println(k1);
        int udskriv;
        udskrivKursus(k1);
    }

    public static void udskrivKursus(Kursus k){
        System.out.println(k);



    }
    }
