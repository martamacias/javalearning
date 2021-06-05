package cat.itb.martamacias7e4.dam.m03.uf6.project.models;

public class Rectangle {
    int id;
    int width;
    int height;

    public Rectangle(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return id+" "+width+" "+height;
    }
}
