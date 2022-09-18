import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Pornim radio");
        // if
        boolean piesaFrumoasa = true;
        // daca imi place piesa dau mai tare
        if (piesaFrumoasa == true) {
            System.out.println("dau mai tare");
            System.out.println("incep sa o fredonez");
        }

        System.out.println("Oprim radio");

        // if else
        int nr = 5;
        if (nr % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        // if, else if, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora invalida");
//        } else if (ora <= 11) {
//            System.out.println("neata");
//        } else if (ora <= 18) {
//            System.out.println("buna ziua");
//        } else if (ora <= 21) {
//            System.out.println("noapte buna");
//        } else if (ora <= 24) {
//            System.out.println("tarziu");
//        } else {
//            System.out.println("ora invalida");
//        }

        //switch - se foloseste cand stim valorile posibile
        System.out.println("alege optiunea ");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("limba romana");
                break;
            case 2:
                System.out.println("limba engleza");
                break;
            default:
                System.out.println("optiune invalida");
        }

    }
}
