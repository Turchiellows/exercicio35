// PACKAGES
package principal;

// IMPORTS
import model.Ave;
import model.Cachorro;

public class Principal {
   public static void main(String[] args) {
      Ave urubu = new Ave();
      Cachorro rex = new Cachorro();
      
      System.out.println(urubu.produzirSom());
      System.out.println(urubu.mover());
      
      System.out.println(rex.produzirSom());
      System.out.println(rex.mover());
      
   }
   
}
