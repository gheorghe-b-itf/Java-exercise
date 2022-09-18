public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipul variabilei

        System.out.println("Am cumparat o masina marca : " + marcaMasina);
        System.out.println("Este modelul : " + modelMasina);

        // suprascriere
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca : " + marcaMasina);
        System.out.println("Este modelul : " + modelMasina);

        //declarare
        String nume;
        String prenume;
        //initializare
        nume = "Burgard";
        prenume = "Gheorghe";
        int varsta = 26;
        //concatenare de string-uri
        System.out.println(nume + " " + prenume + "cu varsta de " + varsta);
    }
}
