package models;

import java.sql.*;

public class Producto{

  public String tabla= "productos";
  public int id;
  public String nombre;
  public float precio;

  public Producto(int id, String nombre){

    this.id= id;
    this.nombre= nombre;

  }

  public Producto(){

  }

  public static Producto[] all(){

    String query;
    int rows;
    ResultSet rs;
    Producto productos[];
    Producto producto= new Producto();

    try{

      Class.forName("com.mysql.jdbc.Driver");
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bluemarket","root","");
      Statement stmt= con.createStatement();
      query= "SELECT COUNT(*) FROM " + producto.tabla;
      rs= stmt.executeQuery(query);
      rs.next();
      rows= rs.getInt(1);

      productos= new Producto[rows];

      query= "SELECT * FROM " + producto.tabla;
      rs= stmt.executeQuery(query);


      for(int i= 0; i < productos.length; i++){
        rs.next();
        productos[i] = new Producto(rs.getInt("id"), rs.getString("nombre"));
      }

      con.close();
      return productos;

    }catch(Exception e){
      System.out.println(e);
    }

    return new Producto[0];

  }

}
