package cat.itb.martamacias7e4.dam.m03.uf4.exercices.vehicles;

public class BicycleModel {
    public static void main(String[] args) {
        VehicleBrand vehicleBrand = new VehicleBrand("lorem", "Togo");
        Bicycle bicycle1 = new Bicycle("modelX", vehicleBrand, 5);
        System.out.println(bicycle1.toString());

        Bicycle bicycle2 = new Bicycle("model5s628", vehicleBrand, 7);
        System.out.println(bicycle2.toString());
    }

}
/*
Una empresa de venda de bicicletes vol fer una aplicació per tenir constància del seu estoc. De cada model de bicicleta en vol guardar el nom, marxes i marca.
De cada marca en vol guardar el nom i el país (el nom del país).

Crea les classes necessaries per guardar aquesta informació.

Fes un petit programa que crei 2 bicicletes d'una única marca i les imprimeixi per pantalla (no s'ha de llegir res de l'usuari).

Output
BicycleModel{name='modelX', gears=5, brand=BycicleBrand{name='lorem', country='Togo'}}
BicycleModel{name='model5s628', gears=7, brand=BycicleBrand{name='lorem', country='Togo'}}

 */