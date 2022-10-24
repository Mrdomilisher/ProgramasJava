
package animales.polimorfismo;
//poli = muchos
//morfismo = formas

public class Casting {
    public static void main(String[] args) {
        
       Perro p1 = new Perro();
//Referencia  variable = new Objecto 
        
     //Upcasting
     Animal animal1 = new Perro();
     animal1.sonido();
     
     //SOLO VA A TENER LOS METODOS DE ANIMAL
     //CUANDO LLAMAN UN METODO EN COMUN, USA LO QUE ESTA DENTRO DEL NEW EN ESTE CASO
     // SONIDO EN PERRO
     
     //Downcasting
     //CASTING ES  CONVERTIR UNA REFENRICA DE UN TIPO A OTRO
     
     Perro animal2 = (Perro)animal1;
     animal2.gruñir();
     
     Animal animal = new Animal();
     //es un
        System.out.println(""+(animal instanceof Perro));
        System.out.println(""+(p1 instanceof Animal));
        System.out.println(""+(animal2 instanceof Perro));
        System.out.println(""+(animal1 instanceof Perro));
    }
  
    
}