package cat.itb.martamacias7e4.dam.m03.uf2.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HighPeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cim> cims = getCims(scanner);
        printPeaks(cims);
    }

    /**
     * crear llista de cims
     * @param scanner
     * @return llista
     */
    private static List<Cim> getCims(Scanner scanner) {
        int quant = scanner.nextInt();
        List<Cim> cims = new ArrayList<>();
        for (int i = 0; i < quant; i++) {
            Cim cim = getCim(scanner);
            cims.add(cim);
        }
        return cims;
    }

    /**
     * scanner de 1 cim
     * @param scanner
     * @return Cim
     */
    private static Cim getCim(Scanner scanner) {
        scanner.nextLine();
        String name = scanner.nextLine();
        int height = scanner.nextInt();
        scanner.nextLine();
        String country = scanner.nextLine();
        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();
        return new Cim(name, height, country, distance, time);
    }

    /**
     * funció per calcular els km/h
     * @param cim
     * @return km/h
     */
    private static double getKmH(Cim cim) {
        double distance = cim.getDistance();
        double time = cim.getTime();
        return (distance/1000)/(time/60);
    }

    /**
     * imprimir tot
     * @param cims
     */
    private static void printPeaks(List<Cim> cims) {
        System.out.println("------------------------\n" +
                "--- Cims aconseguits ---\n" +
                "------------------------");
        for (Cim cim: cims){
            printCim(cim);
        }
        System.out.println("------------------------");
        System.out.println("N. cims: "+cims.size());
        printAlt(cims);
        printRapid(cims);
        printVeloc(cims);
        System.out.println("------------------------");
    }

    /**
     * imprimir el cim amb la màxima velocitat
     * @param cims
     */
    private static void printVeloc(List<Cim> cims) {
        String max = getMaxVeloc(cims);
        System.out.printf("Cim més veloç: %skm/hora%n", max);

    }

    /**
     * calcular el cim amb més velocitat
     * @param cims
     * @return string amb les dades
     */
    private static String getMaxVeloc(List<Cim> cims) {
        String format = "%s %.2f";
        double vel = 0;
        String name = "";
        for (Cim cim: cims){
            if (getKmH(cim)>vel){
                vel = getKmH(cim);
                name = cim.getName();
            }
        }
        return String.format(format, name, vel);
    }

    /**
     * imprimir el cim amb el temps més ràpid
     * @param cims
     */
    private static void printRapid(List<Cim> cims) {
        String max = getMaxRapid(cims);
        System.out.printf("Cim més ràpid: %s%n", max);
    }

    /**
     * calcular el cim amb el temps més ràpid
     * @param cims
     * @return string amb cim més ràpid
     */
    private static String getMaxRapid(List<Cim> cims) {
        String format = "%s (%s)";
        double min = 1000000;
        String name = "";
        String time = "";
        for (Cim cim: cims){
            if (cim.getTime()<min){
                min = cim.getTime();
                name = cim.getName();
                time = toStringTime(cim);
            }
        }
        return String.format(format, name, time);
    }

    /**
     * imprimir el cim més alt
     * @param cims
     */
    private static void printAlt(List<Cim> cims) {
        String max = getMaxAlt(cims);
        System.out.printf("Cim més alt: %s%n", max);
    }

    /**
     * calcular el cim més alt
     * @param cims
     * @return string amb dades del cim més alt
     */
    private static String getMaxAlt(List<Cim> cims) {
        String format = "%s (%dm)";
        int alt = 0;
        String name = "";
        for (Cim cim: cims){
            if (cim.getHeight()>alt){
                alt = cim.getHeight();
                name = cim.getName();
            }
        }
        return String.format(format, name, alt);
    }

    /**
     * imprimir 1 cim
     * @param cim
     */
    private static void printCim(Cim cim) {
        String name = cim.getName();
        String country = cim.getCountry();
        double distance = cim.getDistance();
        String time = toStringTime(cim);
        System.out.printf("%s - %s (%.0fm) - Temps: %s%n", name, country, distance, time);
    }

    /**
     * passar els minuts al format 0:0
     * @param cim
     * @return string amb el format correcte
     */
    private static String toStringTime(Cim cim) {
        String format = "%01d:%01d";
        double time = cim.getTime();
        long hours = TimeUnit.MINUTES.toHours((long) time);
        long hoursMinutes = TimeUnit.HOURS.toMinutes(hours);
        long minutes = TimeUnit.MINUTES.toMinutes((long) time) - hoursMinutes;
        return String.format(format, hours, minutes);
    }
}
/*
Un alpinista ens ha demanat que li fem un programa per enregitrar i evaluar les seves fites.
Vol poder enmagatzemar els diferents cims que ha fet amb dades de la seva ascenció -nom del cim, alçada (metres), país, distància (metres), temps(en minuts)-.

A més a més vol tenir estadístiques del cim més alt, com fet amb el mínim temps i el que s'ha fet a una velocitat més ràpida (distància/temps).

Input
3
Tibidabo
516
Espanya
3120
59
Ama Dablam
6812
Nepal
12451
1085
Puigmal
2913
Espanya
7498
205

Output
------------------------
--- Cims aconseguits ---
------------------------
Tibidabo - Espanya (516m) - Temps: 0:59
Ama Dablam - Nepal (6812m) - Temps: 18:05
Puigmal - Espanya (2913m) - Temps: 3:25
------------------------
N. cims: 3
Cim més alt: Ama Dablam (6812m)
Cim és ràpid: Tibidabo (0:59)
Cim més veloç: Tibidabo 3.17km/hora
------------------------
 */