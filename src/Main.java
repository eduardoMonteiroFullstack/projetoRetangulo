import entities.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("entre com a largura do retangulo");
        double largura = sc.nextInt();
        System.out.println("entre com a altura do retangulo");
        double altura = sc.nextInt();

        retangulo retangulo = new retangulo(largura, altura);

        double area = retangulo.area();
        double perimetro = retangulo.perimetro();
        double diagonal = retangulo.diagonal();

        System.out.println(retangulo);
        System.out.println("a area do retangulo é: " + area);
        System.out.println("o perimetro do retangulo é: " + perimetro);
        System.out.println("a diagonal do retangulo é: " + diagonal);



        sc.close();

    }
}