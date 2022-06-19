import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BancoDao {
    private static List banco;

    public BancoDao(Banco b) {

        this.banco = b.getLista();
    }

    public static void adicionar(Object o) {

        banco.add(o);
    }

    public static void remover(int i) {

//        for (int i = 0; i < banco.size(); i++) {
//            if (o instanceof Pessoa) {
//                Pessoa p1 = (Pessoa) o;
//                Pessoa p2 = (Pessoa) banco.get(i);
//
//                if (p1.equals(p2)) {
//
//                    banco.remove(p1);
//                }
//            }
//        }
//        for (int i = 0; i < banco.size(); i++) {
//            if (o instanceof Veiculo) {
//                Veiculo v1 = (Veiculo) o;
//                Veiculo v2 = (Veiculo) banco.get(i);BancoDao.
//
//                if (v1.equals(v2)) {
//
//                    banco.remove(v1);
//
//                }
//            }
//        }
//
//        for (int i = 0; i < banco.size(); i++) {
//            if (o instanceof RegistroAluguel) {
//                RegistroAluguel r1 = (RegistroAluguel) o;
//                RegistroAluguel r2 = (RegistroAluguel) banco.get(i);
//
//                if (r1.equals(r2)) {BancoDao.
//
//                    banco.remove(r1);
//
//                }
//            }
//        }
        banco.remove(i);
    }

    public static void alterar(Object o) {

        for (int i = 0; i < banco.size(); i++) {

            if (o instanceof Pessoa) {
                Pessoa nova = (Pessoa) o;
                Pessoa velha = (Pessoa) banco.get(i);

                if (nova.equals(velha)) {
                    velha.setNome(nova.getNome());
                    velha.setAnoNascimento(nova.getAnoNascimento());
                }

            }
            if (o instanceof Veiculo) {
                Veiculo novo = (Veiculo) o;
                Veiculo velho = (Veiculo) banco.get(i);

                if (novo.equals(velho)) {
                    velho.setDescricao(novo.getDescricao());
                    velho.setAnoFabrica(novo.getAnoFabrica());
                    velho.setStatus(novo.getStatus());

                }

            }
            if (o instanceof RegistroAluguel) {
                RegistroAluguel novo = (RegistroAluguel) o;
                RegistroAluguel velha = (RegistroAluguel) banco.get(i);

                if (novo.equals(velha)) {

                    velha.setDataLocacao(novo.getDataLocacao());
                    velha.setValorHora(novo.getValorHora());
                    velha.setQtdTempo(novo.getQtdTempo());
                    velha.setValorTipo(novo.getValorTipo());
                    velha.setPessoa(novo.getPessoa());
                    velha.setVeiculo(novo.getVeiculo());
                }

            }
        }
    }//method

    public static List listar() {
        Object o = null;
        List dados = new ArrayList();
        for (int i = 0; i < banco.size(); i++) {
            o = banco.get(i);

            if (o instanceof Pessoa) {

                dados.add(o);

            }

            if (o instanceof Veiculo) {

                dados.add(o);
            }

            if (o instanceof RegistroAluguel) {

               dados.add(o);

            }
        }//for

        return dados;

    }//method
}


