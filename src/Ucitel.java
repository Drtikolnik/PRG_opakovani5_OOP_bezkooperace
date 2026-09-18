public class Ucitel extends Osoba implements IVypisovatelny{

    private String predmet;

    public Ucitel(String jmeno,  String predmet){
        this.jmeno = jmeno;
        this.predmet = predmet;
    }


    @Override
    public void popis() {
        System.out.println("Učitel: " + jmeno + " , vyučuje: " + predmet);
    }



    public void radekVypisu(){
        System.out.println(jmeno+ "      | učitel | předmět: " +predmet);
    }









    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}
