import java.util.Calendar;
import java.util.Objects;

public class RegistroAluguel {

    private int id;
    private Calendar dataLocacao;
    private double valorHora, qtdTempo, valorTipo;
    private Pessoa pessoa;
    private Veiculo veiculo;

    public RegistroAluguel(int id, Calendar dataLocacao, double valorHora, double qtdTempo, double valorTipo, Pessoa pessoa, Veiculo veiculo) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.valorHora = valorHora;
        this.qtdTempo = qtdTempo;
        this.valorTipo = valorTipo;
        this.pessoa = pessoa;
        this.veiculo = veiculo;
    }

    public void descobrirtipo() {
        if (veiculo instanceof Carro) {
            valorTipo = ((Carro) veiculo).getTaxaCarro();
        }
        if (veiculo instanceof Moto) {
            valorTipo = ((Moto) veiculo).getTaxaMoto();
        }
    }


    public RegistroAluguel(int id, Calendar dataLocacao, double valorHora, double qtdTempo, Pessoa pessoa, Veiculo veiculo) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.valorHora = valorHora;
        this.qtdTempo = qtdTempo;
        this.pessoa = pessoa;
        this.veiculo = veiculo;

        descobrirtipo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQtdTempo() {
        return qtdTempo;
    }

    public void setQtdTempo(double qtdTempo) {
        this.qtdTempo = qtdTempo;
    }

    public double getValorTipo() {
        return valorTipo;
    }

    public void setValorTipo(double valorTipo) {
        this.valorTipo = valorTipo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {

        this.pessoa = pessoa;
    }

    public Veiculo getVeiculo() {

        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {

        this.veiculo = veiculo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroAluguel that = (RegistroAluguel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "RegistroAluguel{" +
                "id=" + id +
                ", dataLocacao=" + dataLocacao +
                ", valorHora=" + valorHora +
                ", qtdTempo=" + qtdTempo +
                ", valorTipo=" + valorTipo +
                ", pessoa=" + pessoa +
                ", veiculo=" + veiculo +
                '}';
    }

    public double calcularAluguel() {
        //descobrirtipo();
        return valorHora * qtdTempo * valorTipo;

    }

}
