import java.util.List;

public class Relatorio {

    public double calcularAluguel() {

        List dados = BancoDao.listar();
        double soma = 0;
        double aluguel = 0;

        for (Object o : dados) {
            if (o instanceof RegistroAluguel) {

                aluguel = ((RegistroAluguel) o).calcularAluguel();
                soma = soma + aluguel;
            }
        }
        return soma;
    }

    public void nomeVendedor() {

        List dados = BancoDao.listar();
        double v1 = 0, maior = 0;
        String nome = null;

        for (Object o : dados) {
            if (o instanceof Vendedor) {

                v1 = ((Vendedor) o).calcularSalario();
                if (v1 > maior) {
                    maior = v1;
                    nome = ((Vendedor) o).getNome();

                }

            }
        }
        System.out.println("Vendedor que ganhou: " + nome);

    }

    public void carroAlugado() {

        List dados = BancoDao.listar();
        Veiculo v;
        Veiculo v2;
        Veiculo repete = null;
        int cont = 0;

        for (int i = 0; i < dados.size(); i++) {
            Object o = dados.get(i);
            int qtd = 0;

            if (o instanceof RegistroAluguel) {

                v = ((RegistroAluguel) o).getVeiculo();
                for (int j = 0; j < dados.size(); j++) {
                    Object o2 = dados.get(j);

                    v2 = ((RegistroAluguel) o2).getVeiculo();
                    if (v.getDescricao().equals(v2.getDescricao())) {
                        qtd++;
                    }

                }

                if (qtd > cont) {
                    repete = v;
                    cont = qtd;

                }

            }

        }
        System.out.println("O veiculo mais alugado é: " + repete);

    }

}
