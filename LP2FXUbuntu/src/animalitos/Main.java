package animalitos;

public class Main {

    public static void main(String[] args) {
//        Animal a1= new Perro();          //Upcasting
//        Mamifero m1 = new Perro();       //Upcasting
//        Perro p1 = new Perro();
//        Leon l1 = new Leon();
//        sonidoAnimal(p1);
//        sonidoAnimal(l1);

//        Animal a = new Perro(); //Perro es un Animal, es un objeto perro
//        Mamifero m = (Mamifero) a; //Perro es un mamifero, downcasting, convierte perro en mamifero. El perro es un mamifero entonces sí se puede, a es un objeto perro

        Animal animal;
        Mamifero mamifero = new Mamifero();
        Leon leon = new Leon();
        Perro perro = new Perro();
        
        
        Animal animal1 = new Perro(); //Perro es un animal: si. Entonces se crea un objeto de tipo Animal pero con metodos en comun con los de Perro
        Mamifero m = (Mamifero)animal1;//Animal es un mamifero: no. Entonces lo convierte en mamifero y usa los metodos en comun de perro.
        mamifero.sonido();
        m.sonido();
                
        Ave ave = new Ave();
        Gallo gallo = new Gallo();
        Paloma paloma = new Paloma();

        System.out.println("\nUPCASTING");
        mamifero = leon;
        mamifero.sonido();
        animal = perro;
        animal.sonido();
        animal = gallo;
        animal.sonido();
        ave=paloma;
        ave.sonido();

        System.out.println("\nDOWNCASTING");
        animal = gallo;
        ave = (Gallo) animal;
        
        ave.sonido();
        Gallo gallo2 = (Gallo) animal;
        gallo2.sonido();
        
        animal= paloma;
        ave=(Paloma)animal;
        ave.sonido();

        System.out.println("\nINSTANCEOF leon");
        esInstanciaDe(leon);

        System.out.println("\nINSTANCEOF gallo");
        esInstanciaDe(gallo);

    }

    public static void esInstanciaDe(Animal animal) {
        System.out.println("Animal: " + (animal instanceof Animal));
        System.out.println("Mamifero: " + (animal instanceof Mamifero));
        System.out.println("León: " + (animal instanceof Leon));
        System.out.println("Perro: " + (animal instanceof Perro));
        System.out.println("Ave: " + (animal instanceof Ave));
        System.out.println("Paloma: " + (animal instanceof Paloma));
 System.out.println("Gallo: " + (animal instanceof Gallo));
    }

    public static void sonidoAnimal(Animal a) {
        a.sonido();
    }

}
