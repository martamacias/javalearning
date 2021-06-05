package cat.itb.martamacias7e4.dam.m03.uf4.exercices.mechanicalArm;

public class MechanicalArm {
    double openAngle;
    double altitude;
    boolean turnedOn;

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void updateAngle(double openAngle) {
        if (turnedOn && (this.openAngle + openAngle)>=0 && (this.openAngle + openAngle)<=360){
            this.openAngle += openAngle;
        }
    }

    public void updateAltitude(double altitude) {
        if (turnedOn && (this.altitude + altitude)>=0){
            this.altitude += altitude;
        }
    }

    @Override
    public String toString() {
        return "MechanicalArm{" +
                "openAngle=" + openAngle +
                ", altitude=" + altitude +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
