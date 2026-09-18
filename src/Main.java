import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        SkolniSystem ss = new SkolniSystem();

    for(;;){
        System.out.println("MENU");
        System.out.println("1 - přidat studenta");
        System.out.println("2 - vypsat studenty");
        System.out.println("3 - hledat podle jména");
        System.out.println("4 - přidat učitele");
        System.out.println("5 - vypsat osoby");
        int vyber = sc.nextInt();
        sc.nextLine();

        switch (vyber){
            case 1:
                    System.out.println("zadej jméno");
                    String jmeno = sc.nextLine();
                    System.out.println("zadej rocnik");
                    int rocnik = sc.nextInt();
                    sc.nextLine();
                    System.out.println("zadej prumer");
                    double prumer = sc.nextDouble();
                    sc.nextLine();
                    ss.pridatStudenta(new Student(jmeno, rocnik, prumer));
                break;

            case 2:
                    ss.vypsatStudenty();

                break;

            case 3:
                System.out.println("zadej jméno");
                ss.najitDleJmena(sc.nextLine());
                break;

            case 4:
                System.out.println("zadej jméno");
                String jmenoUcitele = sc.nextLine();
                System.out.println("zadej předmět");
                String predmet = sc.nextLine();
                ss.pridatUcitele(new Ucitel(jmenoUcitele, predmet));
                break;

            case 5:
                ss.vypsatOsoby();
                break;
        }


    }









    }
}