import java.util.Arrays;

public class Kursus {
    private int kursusNr;
    private String kursusNavn;
    private int antalEcts;
    private String ugeDag;
    private String tid;
    private Studerende [] deltagere;
    private int antalDeltagere;



    public Kursus(int kursusNr, String kursusNavn, int antalEcts, String ugeDag, String tid) {
        this.kursusNr = kursusNr;
        this.kursusNavn = kursusNavn;
        this.antalEcts = antalEcts;
        this.ugeDag = ugeDag;
        this.tid = tid;
        this.antalDeltagere=0;
        this.deltagere=new Studerende[40];

    }
    public void tilfoejStuderende(Studerende navn){
        if(antalDeltagere<40){
            deltagere[antalDeltagere]=navn;
            antalDeltagere++;


        }
    }

    public int getKursusNr() {
        return kursusNr;
    }

    public void setKursusNr(int kursusNr) {
        this.kursusNr = kursusNr;
    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public int getAntalEcts() {
        return antalEcts;
    }

    public void setAntalEcts(int antalEcts) {
        this.antalEcts = antalEcts;
    }

    public String getUgeDag() {
        return ugeDag;
    }

    public void setUgeDag(String ugeDag) {
        this.ugeDag = ugeDag;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Studerende[] getDeltagere() {
        return deltagere;
    }

    public void setDeltagere(Studerende[] deltagere) {
        this.deltagere = deltagere;
    }

    public int getAntalDeltagere() {
        return antalDeltagere;
    }

    public void setAntalDeltagere(int antalDeltagere) {
        this.antalDeltagere = antalDeltagere;
    }

    @Override
    public String toString() {
        return "Kursus{" +
                "kursusNr=" + kursusNr +
                ", kursusNavn='" + kursusNavn + '\'' +
                ", antalEcts=" + antalEcts +
                ", ugeDag='" + ugeDag + '\'' +
                ", tid='" + tid + '\'' +
                ", deltagere=" + Arrays.toString(deltagere) +
                ", antalDeltagere=" + antalDeltagere +
                '}';
    }
}
