package cat.itb.martamacias7e4.dam.m03.uf4.exercices;

import cat.itb.martamacias7e4.dam.m03.uf2.classfun.Rectangle;

import java.util.List;

public class Board {
    List<Rectangle> rectangles;

    public double getTotalArea(){
        double area = 0;
        for(Rectangle rectangle: rectangles){
            area+= rectangle.getArea(rectangle);
        }
        return area;
    }
    public int countRectangle(){
        return rectangles.size();
    }
}
/*
Converteix la següent classe amb funcions estàtiques a una versió no estàtica

public class BoardFunctions {
    public static double getTotalArea(List<Rectangle> rectangles){
        double area = 0;
        for(Rectangle rectangle: rectangles){
            area+= rectangle.getArea();
        }
        return area;
    }
    public static int countRectangle(List<Rectangle> rectangles){
        return rectangles.size();
    }
}
 */