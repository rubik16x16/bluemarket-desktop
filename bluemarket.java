import java.sql.*;
import java.util.Scanner;
import models.producto;

public class bluemarket{

  public static void main(String args[]){

    String menu[]= {"Opcion1", "Opcion2", "Opcion3"};
    int opcion;

    System.out.println("Menu");

    for(int i= 0; i < menu.length; i++)
      System.out.println(menu[i] + " " + i);

    Scanner stdin= new Scanner(System.in);
    opcion= stdin.nextInt();

    if(opcion > (menu.length - 1)){
      System.out.println("Esta opcion no esta registrada");
    }else{
      System.out.println("Su opcion fue: " + opcion);
    }

  }

}
