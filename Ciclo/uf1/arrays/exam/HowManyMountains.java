package cat.itb.martamacias7e4.dam.m03.uf1.arrays.exam;

public class HowManyMountains {
    public static void main(String[] args) {
        double[][] map ={{1.5,1.6,1.8,1.7,1.6},{1.5,2.6,2.8,2.7,1.6},{1.5,4.6,4.4,4.9,1.6},
                {2.5,1.6,3.8,7.7,3.6},{1.5,2.6,3.8,2.7,1.6}};
        int mount = 0;
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                if (map[i-1][j-1]>=map[i][j]){
                    mount++;
                }
            }
        }
        System.out.println(mount);
    }
}