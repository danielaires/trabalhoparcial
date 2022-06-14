public class Vendedor extends Pessoa{

    double valorHora;
    int qtdHora;
    int comissao;


    public double calcularSalario(){
        return qtdHora * valorHora;
    }
}
