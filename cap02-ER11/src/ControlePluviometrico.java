public class ControlePluviometrico {

    private String data;
    private double quantidade;

    public ControlePluviometrico(String data, double quantidade) {
        this.data = data;
        this.quantidade = quantidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}
