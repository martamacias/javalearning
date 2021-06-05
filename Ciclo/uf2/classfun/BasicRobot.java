package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicRobot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Robot robot = Robot.getRobot();
        readPosition(scanner, robot);
    }

    private static void readPosition(Scanner scanner, Robot robot) {
        System.out.print("> ");
        String position = scanner.nextLine();
        robot = Robot.getRobot();
        while (!position.equals("END")) {
            switch (position) {
                case "DALT":
                    robot.moveUp();
                    break;
                case "BAIX":
                    robot.moveDown();
                    break;
                case "DRETA":
                    robot.moveRight();
                    break;
                case "ESQUERRA":
                    robot.moveLeft();
                    break;
                case "ACCELERAR":
                    if (robot.velocity < 10) {
                        robot.moreVeloc();
                    }
                    break;
                case "DISMINUIR":
                    if (robot.velocity > 0) {
                        robot.lessVeloc();
                    }
                    break;
                case "POSICIO":
                    printPosition(robot);
                    break;
                case "VELOCITAT":
                    printVelocity(robot);
                    break;
                default: break;
            }
            System.out.print("> ");
            position = scanner.nextLine();
        }
    }

    private static void printVelocity(Robot robot) {
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("La velocitat del robot és "+ format.format(robot.velocity));
    }

    private static void printPosition(Robot robot) {
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("La posició del robot és ("+format.format(robot.x)+", "+format.format(robot.y)+")");
    }
}

/*
Fes un programa que permeti moure un robot en un plà 2D.
El robot ha de guardar la seua posició (X, Y) i la velocitat actual. Per defecte, la posició serà (0, 0) i la velocitat és 1. La velocitat indica la distància que recorre el robot en cada acció.

El robot té les següents accions:

DALT: El robot és mou cap a dalt (tenint en compte la velocitat).
BAIX: El robot és mou cap a baix (tenint en compte la velocitat).
DRETA: El robot és mou cap a la dreta (tenint en compte la velocitat).
ESQUERRA: El robot és mou cap a la esquerra (tenint en compte la velocitat).
ACCELERAR: El robot augmenta en 0.5 la velocitat. La velocitat màxima és 10.
DISMINUIR: El robot augmenta en 0.5 la velocitat. La velocitat mínima és 0.
POSICIO: El robot imprimeix la seua posició.
VELOCITAT: El robot imprimeix la seua velocitat.
El programa acaba amb l'acció END.

Exemple
Les línies que comencen per > són el que ha escrit l'usuari

> POSICIO
La posició del robot és (0, 0)
> DALT
> DALT
> ESQUERRA
> POSICIO
La posició del robot és (-1, 2)
> ACCELERAR
> VELOCITAT
La velocitat del robot és 1.5
> DALT
> POSICIO
La posició del robot és (-1, 3.5)
> END
 */