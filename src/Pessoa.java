import java.util.Objects;

public class Pessoa {

    private int id,anoNascimento;
    private String nome;

    private void gerarID(){
        id++;
    }

    public Pessoa(int id, int anoNascimento, String nome) {
        this.id = id;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
    }

    public Pessoa() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", anoNascimento=" + anoNascimento +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id == pessoa.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    public int calcularIdade(int anoAtual){
        return anoAtual - anoNascimento;

    }

}
