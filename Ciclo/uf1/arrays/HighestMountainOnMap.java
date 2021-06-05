package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

public class HighestMountainOnMap {
    public static void main(String[] args) {
        double[][] map ={{1.5,1.6,1.8,1.7,1.6},{1.5,2.6,2.8,2.7,1.6},{1.5,4.6,4.4,4.9,1.6},
                {2.5,1.6,3.8,7.7,3.6},{1.5,2.6,3.8,2.7,1.6}};
        int xmayor =0, ymayor=0;
        double high = 0;
        for (int x=0; x<5; x++){
            for (int y=0; y<5; y++){
                if (high<map[x][y]){
                    high = map[x][y];
                    xmayor = x;
                    ymayor = y;
                }
            }
        }
        System.out.println(xmayor+", "+ymayor+": "+high+" metres");

    }
}
//x, y: 1.5 metres