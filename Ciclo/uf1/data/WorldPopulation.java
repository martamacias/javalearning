package cat.itb.martamacias7e4.dam.m03.uf1.data;

public class WorldPopulation {
    public static void main(String[] args) {
        // int es petit, s'utilitza long per números més grans i es posa l al final (de long)
        long worldPopulation = 7_800_000_000l;

        // double no hi ha lletra al final, amb float es posa la f
        System.out.println(0.12345678901234567890);
        System.out.println(0.12345678901234567890f);
        System.out.println(123_456_789_123_456_789.0);
        System.out.println(123_456_789_123_456_789.0f);
    }
}
