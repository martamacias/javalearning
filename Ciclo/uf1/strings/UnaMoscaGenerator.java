package cat.itb.martamacias7e4.dam.m03.uf1.strings;

import java.util.Scanner;

public class UnaMoscaGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
        String mosca = "una mosca volava per la llum.\n" +
                "i la llum es va apagar.\n" +
                "i la pobra mosca\n" +
                "es va quedar a les fosques\n" +
                "i la pobra mosca no va poder volar.";

        char volcal = ch.charAt(0);
        mosca = mosca.replace('a', volcal).replace('e', volcal).replace('i', volcal)
                .replace('o', volcal).replace('u', volcal);

        System.out.print(mosca);
    }
}
/*La º111canço tradicional de la mosca és la següent:

una mosca volava per la llum.
i la llum es va apagar.
i la pobra mosca
es va quedar a les fosques
i la pobra mosca no va poder volar.

Un cop candata, la canço es canta substituint totes les vocals per una de sola (totes les vocals canviades per la A).
Volem fer un programa que es digui la lletra donada la vocal amb la que volem substituir.

input: i
output: ini misci vilivi pir li llim. I li llim is vi ipigir.
I li pibri misci is vi qiidir i lis fisqiis i li pibri misci ni vi pidir vilir.*/