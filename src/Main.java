// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------");
        perro perro1 = new perro();
        perro1.nombre="boby";
        perro1.edad = 5;
        perro1.raza = "delmer";
        perro1.miPerro();
        System.out.println("-------------");
        perro perro2 = new perro();
        perro2.nombre="toby";
        perro2.edad = 8;
        perro2.raza = "qwerty";
        perro2.miPerro();
    }
}