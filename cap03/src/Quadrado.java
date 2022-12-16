public class Quadrado {
    private double lado;
    public void setLado(double l){
        if(l<0) throw  new RuntimeException("Lado inválido.");
        lado = l;
    }
    public double area(){
        return lado * lado;
    }
}
