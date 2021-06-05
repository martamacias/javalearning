package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;

public class IsThereAMultipleOf7 {
    public static void main(String[] args) {
        int[] values = {4,8,9,40,54,84,40,6,84,1,1,68,84,68,4,840,684,25,40,98,54,687,31,4894,468,46,84687,894,40,846,1681,618,161,846,84687,6,848};
        boolean[] seven = new boolean[values.length];
        int i = 0;
        while (values.length > i){
            if (values[i] % 7 == 0){
                seven[i] = true;
            }
            i++;
        }
        System.out.println(Arrays.toString(seven));
    }
}
/*Donat el següent vector, imprimeix true si algún dels números és divisible entre 7 o false sinó.*/