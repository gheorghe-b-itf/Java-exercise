/*
Recap :
variabile
tipuri  de date : char, string, int, float/double, boolean

Operatori:
aritmetici: *, +, -, /, %
de comparare: < >, ==, !=, <=, >=
logici: || , &&, ! (not)

Flow control - if else
*/

public class Operatori {
    public static void main(String[] args) {
        int a = 3; // declarare si initializare
        int b = 5;
        a = b; // suprascriere
        System.out.println(a != b); //false
        System.out.println(7>b && 8>a); //true
        System.out.println(7>b || (8>a || 4>b)); //true

    }

}
