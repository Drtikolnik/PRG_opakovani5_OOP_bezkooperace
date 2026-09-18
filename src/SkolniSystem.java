import java.util.ArrayList;

public class SkolniSystem {
    ArrayList<Osoba> osoby = new ArrayList<>();

    public void pridatStudenta(Osoba osoba){

        osoby.add(osoba);
    }

    public void pridatUcitele(Ucitel ucitel){
        osoby.add(ucitel);
    }

    public void vypsatStudenty(){
        for(Osoba o : osoby){
            if(o instanceof Student){
                ((Student) o).radekVypisu();
            }

        }
    }

    public void vypsatOsoby(){
        for(Osoba o : osoby){
            if(o instanceof Student){
                ((Student)  o).radekVypisu();
            }else{
                ((Ucitel)o).radekVypisu();
            }
        }
    }

    public void najitDleJmena(String jmeno){
        for(Osoba o : osoby){
            if(o.getJmeno().equals(jmeno)){
                if(o instanceof Student){
                    ((Student) o).radekVypisu();
                }else{
                    ((Ucitel)o).radekVypisu();
                }
            }
        }
    }
}