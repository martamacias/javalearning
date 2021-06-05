package cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures;

public class Figure {
    String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void changeColor(){
        System.out.print(color);
    }
    public void resetColor(){
        System.out.println(ConsoleColors.RESET);
    }

}
