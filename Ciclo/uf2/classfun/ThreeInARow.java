package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.Scanner;

public class ThreeInARow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] table = {{"· ","· ","· "},{"· ","· ","· "},{"· ","· ","· "}};
        System.out.print("> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        table[x][y] = "X ";
        printTable(table);

        for (int torn = 1; torn < 10; torn++) {
            System.out.print("> ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            String turn;
            if (torn%2==0){ turn = "X "; }else { turn = "0 "; }
            if (!win(table, turn) && table[x][y].equals("· ") && !full(table))
                setTable(table, x, y, torn);
                printTable(table);

            if (win(table, turn)){
                System.out.println("guanyen les "+turn);
                break;
            }else if (full(table)){
                System.out.println("empat");
                break;
            }
        }
    }

    public static boolean full(String[][] table) {
        return !table[0][0].equals("· ") && !table[0][1].equals("· ") && !table[0][2].equals("· ") &&
                !table[1][0].equals("· ") && !table[1][1].equals("· ") && !table[1][2].equals("· ") &&
                !table[2][0].equals("· ") && !table[2][1].equals("· ") && !table[2][2].equals("· ");
    }


    public static boolean win(String[][] table, String turn) {
        // Comprueba diagonal a la derecha
        if ( table[0][0].equals(turn) &&
                table[1][1].equals(turn) &&
                table[2][2].equals(turn) ) return true;
        // Comprueba diagonal a la izquierda
        if ( table[0][2].equals(turn) &&
                table[1][1].equals(turn) &&
                table[2][0].equals(turn) ) return true;

        // Comprueba filas y columnas
        for(int i=0; i < 3; i++) {
            // Comprueba filas
            if ( table[i][0].equals(turn) &&
                    table[i][1].equals(turn) &&
                    table[i][2].equals(turn) ) return true;
            // Comprueba columnas
            if ( table[0][i].equals(turn) &&
                    table[1][i].equals(turn) &&
                    table[2][i].equals(turn) ) return true;
        }

        return false;
    }

    public static void setTable(String[][] table, int x, int y, int torn) {
        if (torn%2==0){
            table[x][y] = "X ";
        }else {
            table[x][y] = "0 ";
        }
}

    private static void printTable(String[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String box = table[i][j];
                System.out.print(box);
            }
            System.out.println();
        }
    }
}
/*

> 0 0
X · ·
· · ·
· · ·
> 1 1
X · ·
· 0 ·
· · ·
> 0 1
X X ·
· 0 ·
· · ·
> 2 2
X X ·
· 0 ·
· · 0
> 0 2
X X X
· 0 ·
· · 0
guanyen les X
 */
