import java.util.Objects;

public class Carro extends Veiculo{

    private double taxaCarro;

    public Carro(int id, int anoFabrica, String descricao, String status, double taxaCarro) {
        super(id, anoFabrica, descricao, status);
        this.taxaCarro = taxaCarro;
    }

    public double getTaxaCarro() {
        return taxaCarro;
    }

    public void setTaxaCarro(double taxaCarro) {
        this.taxaCarro = taxaCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "taxaCarro=" + taxaCarro +
                '}';
    }
}
