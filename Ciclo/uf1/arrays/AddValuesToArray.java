package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;

public class AddValuesToArray {
    public static void main(String[] args) {
        float[] floats = new float[50];
        floats[0] = 31;
        floats[1] = 56;
        floats[19] = 12;
        floats[49] = 79;

        System.out.print(Arrays.toString(floats) +" ");
    }
}
/*Inicialitza un array de floats de tamany 50, amb el valor 0.0f a tots els elements.
Després asigna els els valors següents a les posicions indicades:

primera: 31.0f
segona: 56.0f
vintena: 12.0f
última: 79.0f*/
