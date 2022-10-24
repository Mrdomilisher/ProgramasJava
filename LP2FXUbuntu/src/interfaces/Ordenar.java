package interfaces;

import java.util.Arrays;

public class Ordenar {

    public static void main(String[] args) {
        char[] letras = {'X', 'A', 'P', 'C'};
        int[] numeros = {5, 3, 10, 4};

        Perro[] perros = {new Perro(10), new Perro(3), new Perro(7)};
        Arrays.sort(letras);
        System.out.println(Arrays.toString(letras));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(perros);
        System.out.println(Arrays.toString(perros));
    }

}

class Perro implements Comparable<Perro> {

    private int edad;

    public Perro(int edad) {
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "edad=" + edad + '}';
    }

    @Override
    public int compareTo(Perro t) {
        return this.edad-t.edad;
//        if (this.edad > t.edad) {
//            return 1;
//        } else if (this.edad < t.edad) {
//            return -1;
//        } else {
//            return 0;
//        }
    }

}