package cat.itb.martamacias7e4.dam.m03.uf5.exercices.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DificultPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        while (!password.equals("END")){
            isValidPassword(password);
            password = scanner.nextLine();
        }
    }

    private static void isValidPassword(String password) {
        String regex = "[A-Za-z0-9@#~$?]{8,40}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            System.out.println("Dificultat alta");
        }else{
            System.out.println("No és de dificultat alta");
        }
    }
}
/*
Considerarem que una contrassenya és de dificultat alta si:

té més de 8 caracters
té lletres i números
té un dels següents caràcters: @,#,~,$
no té 3 lletres consecutives
no té 3 números consecutius
Llegeix els passwords per pantalla i printa sí són de dificultat alta. S'acaba amb la paraula END.

Input
uh34$i3os92i$
aaaa1$we23ew23
3e$@
END

Ouput
Dificultat alta
No és de dificultat alta
No és de dificultat alta
 */