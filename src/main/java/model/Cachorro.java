// PACKAGES
package model;

// IMPORTS
public class Cachorro implements Animal {

   @Override
   public String produzirSom() {
      return "Latir";
   }

   @Override
   public String mover() {
      return "Andar";
   }

}
