package entities;

public class retangulo {
    double largura;
    double altura;

    public retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }



    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return (largura + altura) * 2;
    }

    public double diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }

    @Override
    public String toString() {
        return "retangulo{"
                +
                "largura="
                +
                largura
                +
                ", altura="
                + altura
                +
                '}';
    }
}
