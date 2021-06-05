package cat.itb.martamacias7e4.dam.m03.uf4.exercices.mechanicalArm;

public class MechanicalArmApp{
    public static void main(String[] args) {
        MechanicalArm arm = new MechanicalArm();
        arm.setTurnedOn(true);
        System.out.println(arm.toString());
        arm.updateAltitude(3);
        System.out.println(arm.toString());
        arm.updateAngle(180);
        System.out.println(arm.toString());
        arm.updateAltitude(-3);
        System.out.println(arm.toString());
        arm.updateAngle(-180);
        System.out.println(arm.toString());
        arm.updateAltitude(3);
        System.out.println(arm.toString());
        arm.setTurnedOn(false);
        System.out.println(arm.toString());
    }
}