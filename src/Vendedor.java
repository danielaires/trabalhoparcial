import java.util.Objects;

public class Vendedor extends Pessoa {

    private double valorHora;
    private int qtdHora;
    private int comissao;

    public Vendedor(int id, int anoNascimento, String nome) {
        super(id, anoNascimento, nome);
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
        this.comissao = comissao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(int qtdHora) {
        this.qtdHora = qtdHora;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vendedor vendedor = (Vendedor) o;
        return Double.compare(vendedor.valorHora, valorHora) == 0 && qtdHora == vendedor.qtdHora && comissao == vendedor.comissao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), valorHora, qtdHora, comissao);
    }

    public double calcularSalario() {

        return valorHora * qtdHora + comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorHora=" + valorHora +
                ", qtdHora=" + qtdHora +
                ", comissao=" + comissao +
                '}';
    }
}
