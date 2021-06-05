package cat.itb.martamacias7e4.dam.m03.uf6.project.data;

import cat.itb.martamacias7e4.dam.m03.uf6.project.models.Rectangle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RectangleDAO {
    Database database;

    public RectangleDAO(Database database) {
        this.database = database;
    }

    public void insert(Rectangle r) throws SQLException {
        String query = "INSERT INTO rectangles(width, height) VALUES(?, ?)";
        PreparedStatement insertStatement = database.getConnection().prepareStatement(query);
        insertStatement.setInt(1, r.getWidth());
        insertStatement.setInt(2, r.getHeight());
        insertStatement.execute();
    }
    public List<Rectangle> list() throws SQLException {
        String query = "SELECT * FROM rectangles";
        Statement listStatement = database.getConnection().createStatement();
        ResultSet resultat = listStatement.executeQuery(query);
        return toRectangleList(resultat);
    }
    public List<Rectangle> toRectangleList(ResultSet resultat) throws SQLException {
        List<Rectangle> list = new ArrayList<>();
        while (resultat.next()){
            int id = resultat.getInt("id");
            int width = resultat.getInt("width");
            int height = resultat.getInt("height");
            list.add(new Rectangle(id, width, height));
        }
        return list;
    }
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM rectangles WHERE id = ?";
        PreparedStatement insertStatement = database.getConnection().prepareStatement(query);
        insertStatement.setInt(1, id);
        insertStatement.execute();
    }
    public void update(Rectangle r) throws SQLException {
        String query = "UPDATE rectangles SET(width, height) = (?, ?) WHERE id = ?";
        PreparedStatement updateStatement = database.getConnection().prepareStatement(query);
        updateStatement.setInt(1, r.getWidth());
        updateStatement.setInt(2, r.getHeight());
        updateStatement.setInt(3, r.getId());
        updateStatement.execute();
    }
}
