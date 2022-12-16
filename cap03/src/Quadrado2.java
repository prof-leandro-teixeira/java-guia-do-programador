public class Quadrado2 {

    public Quadrado2() {
    }

    public Quadrado2(double lado) {
        this.lado = lado;
    }

    private double lado = 4.5;
    public void setLado(double l){
        if(l<0) throw  new RuntimeException("Lado inválido.");
        lado = l;
    }
    public double area(){
        return lado * lado;
    }
}
