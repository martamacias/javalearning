package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> answers = new HashSet<>();
        String answer = scanner.nextLine();
        while (!answer.equals("END")){
            if (answers.contains(answer)){
                System.out.println("MEEEC!");
            }else {
                answers.add(answer);
            }
            answer = scanner.nextLine();
        }
    }
}
/*
Volem fer un petit joc tipus Scatergories o Un, Dos tres, on els diferents jugadors han de dir respostes a una pregunta, però no es poden fer repeticions.
Fes un programa que llegeixi la resposta per l'input i printi "MEEEC!" quan hi hagi una repetició. El programa s'acaba quan l'usuari escriu END

Input
poma
pera
cirera
pera
cindria
meró
cirera
END

Output
MEEEC!
MEEEC!
 */