package retangulo;

public class Retangulo {
    
    double altura;
    double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double calcularArea(){
        return altura*largura;
    }
    
}
