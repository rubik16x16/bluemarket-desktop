import java.util.Scanner;
import controllers.*;
import helpers.*;

public class BluemarketApp{

  public static void main(String args[]){

    ClearScreen.clear();

    String menu[]= {"Productos", "Opcion2", "Opcion3"};
    int opcion;

    System.out.println("Menu");

    for(int i= 0; i < menu.length; i++)
      System.out.println(i + "-" + menu[i]);

    Scanner stdin= new Scanner(System.in);
    opcion= stdin.nextInt();

    switch(opcion){
      case 0:
        ProductosController controller= new ProductosController();
      break;
      default:
        System.out.println("Esta opcion no es valida");
    }

  }

}
