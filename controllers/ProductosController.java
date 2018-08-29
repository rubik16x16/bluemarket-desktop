package controllers;

import java.util.Scanner;
import helpers.*;
import models.Producto;

public class ProductosController{

  private String opciones[]= {"Index Productos", "Create productos"};

  public ProductosController(){

    ClearScreen.clear();

    int opcion;

    System.out.println("Menu \n");

    for(int i=0; i < this.opciones.length; i++){
      System.out.println(i + "-" + this.opciones[i]);
    }

    System.out.println("\nEscoja una opcion:");

    Scanner stdin= new Scanner(System.in);
    opcion= stdin.nextInt();

    switch(opcion){
      case 0:
        this.index();
      break;
      case 1:
        this.create();
      break;
      default:
        System.out.println("Esta opcion no es valida");
    }

  }

  public void index(){

    ClearScreen.clear();
    Producto productos[]= Producto.all();
    for(int i= 0; i < productos.length; i++){
      System.out.println(productos[i].id + "-" +productos[i].nombre);
    }

  }

  public void create(){

    String nombre;

    ClearScreen.clear();
    System.out.print("Ingrese nombre del nuevo producto:");
    Scanner stdin= new Scanner(System.in);
    nombre= stdin.nextLine();

  }

}
