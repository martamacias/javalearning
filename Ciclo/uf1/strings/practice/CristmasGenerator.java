package cat.itb.martamacias7e4.dam.m03.uf1.strings.practice;

import java.util.Scanner;

public class CristmasGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int any = scanner.nextInt();
        String desti = scanner.next();
        String autor = scanner.next();

        System.out.printf("Feliç %d %s.\n" +
                "Et desitgem que confiïs més en tu mateixa Mariona, que busquis, trobis i aconsegueixis tots els teus objectius, que superis tots els teus límits,\n" +
                "que t'envolti l'amor per tot arreu, i que t'adonis d'una punyetera vegada que ets increïble tal com ets  i  que pots aconseguir tot allò que et proposis.\n" +
                "\n" +
                "Fins aviat\n" +
                "%s", any, desti, autor);
    }
}
/*input

2020 2021
Mariona Marta
Marc Martina
Feliç 2020 Mariona.
Et desitgem que confiïs més en tu mateixa Mariona, que busquis, trobis i aconsegueixis tots els teus objectius, que superis tots els teus límits,
que t'envolti l'amor per tot arreu, i que t'adonis d'una punyetera vegada que ets increïble tal com ets  i  que pots aconseguir tot allò que et proposis.

Fins aviat
Marc
END


output:

Feliç 2021 Marta.
Et desitgem que confiïs més en tu mateixa Marta, que busquis, trobis i aconsegueixis tots els teus objectius, que superis tots els teus límits,
que t'envolti l'amor per tot arreu, i que t'adonis d'una punyetera vegada que ets increïble tal com ets  i  que pots aconseguir tot allò que et proposis.

Fins aviat
Martina*/