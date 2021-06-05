package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.twitter;

public class Tweet {
    String usuari;
    String data;
    String text;

    public Tweet(String usuari, String data, String text) {
        this.usuari = usuari;
        this.data = data;
        this.text = text;
    }
    public void print() {
        System.out.printf("@%s · %s %n%s%n", usuari, data, text);
        System.out.println();
    }
}
