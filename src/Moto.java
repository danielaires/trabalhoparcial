import java.util.Objects;

public class Moto extends Veiculo{

    private double taxaMoto;

    public Moto(int id, int anoFabrica, String descricao, String status, double taxaMoto) {
        super(id, anoFabrica, descricao, status);
        this.taxaMoto = taxaMoto;
    }

    public double getTaxaMoto() {
        return taxaMoto;
    }

    public void setTaxaMoto(double taxaMoto) {
        this.taxaMoto = taxaMoto;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "taxaMoto=" + taxaMoto +
                '}';
    }
}
