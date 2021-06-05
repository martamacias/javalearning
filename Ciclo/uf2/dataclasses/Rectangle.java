package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return width;
    } //GENERAL: public tipus getNOM-VARIABLE()

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width; //l'amplada del rectangle actual es igual. MODIFICA AMB LA DE GET LA ORIGINAL.
    }
}
