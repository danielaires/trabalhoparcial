import java.util.Objects;

public class Veiculo {

    private int id, anoFabrica;
    private String descricao, status;


    public Veiculo(int id, int anoFabrica, String descricao, String status) {
        this.id = id;
        this.anoFabrica = anoFabrica;
        this.descricao = descricao;
        this.status = status;
    }

    public Veiculo(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoFabrica() {
        return anoFabrica;
    }

    public void setAnoFabrica(int anoFabrica) {
        this.anoFabrica = anoFabrica;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return id == veiculo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", anoFabrica=" + anoFabrica +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int calcularTempoVeiculo(int atual) {

        return atual - anoFabrica;
    }

    public void alterarStatus() {

    }
}
