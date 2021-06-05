package cat.itb.martamacias7e4.dam.m03.uf4.exercices.vehicles;

public class VehicleModel {
    public static void main(String[] args) {
        VehicleBrand vehicleBrand = new VehicleBrand("lorem", "Togo");
        Bicycle bicycle = new Bicycle("modelX", vehicleBrand, 5);
        System.out.println(bicycle.toString());

        Scooter scooter = new Scooter("s562", vehicleBrand, 45.3);
        System.out.println(scooter.toString());
    }
}
/*
L'empresa que feia bicicletes ara també ven patinets.
Tingues en compte que els patinets no tenen marxes. Per altre banda si que t'has de guardar la potencia que tenen.
Crea i modifica les classes que necessitis.

Fes un petit programa que crei una bicicleta i un patinet d'una única marca i les imprimeixi per pantalla (no s'ha de llegir res de l'usuari).

Output
BicycleModel{name='modelX', gears=5, brand=VehicleBrand{name='lorem', country='Togo'}}
ScooterModel{name='s562', power=45.3, brand=VehicleBrand{name='lorem', country='Togo'}}
 */