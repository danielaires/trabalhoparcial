import java.util.ArrayList;
import java.util.List;


public class BancoDao {
    private static List banco = new ArrayList();

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

            if (o instanceof Vendedor) {
                Vendedor novo = (Vendedor) o;
                Vendedor velho = (Vendedor) banco.get(i);

                if (novo.equals(velho)) {

                    velho.setNome(novo.getNome());
                    velho.setValorHora(novo.getValorHora());
                    velho.setQtdHora(novo.getQtdHora());
                    velho.setComissao(novo.getComissao());

                }

            }

        }
    }//method

    public static List<Pessoa> listaPessoa() {
        List<Pessoa> lista = new ArrayList();
        for (Object registro : banco) {
            if (registro instanceof Pessoa) {
                lista.add((Pessoa) registro);
            }
        }
        return lista;
    }

    public static List<Veiculo> listaVeiculo() {
        List<Veiculo> lista = new ArrayList();
        for (Object registro : banco) {
            if (registro instanceof Veiculo) {
                lista.add((Veiculo) registro);
            }
        }
        return lista;
    }

    public static List<RegistroAluguel> listaRegistro() {
        List<RegistroAluguel> lista = new ArrayList();
        for (Object registro : banco) {
            if (registro instanceof RegistroAluguel) {
                lista.add((RegistroAluguel) registro);
            }
        }
        return lista;
    }


    public static List<Vendedor> listaVendedor() {
        List<Vendedor> lista = new ArrayList();
        for (Object registro : banco) {
            if (registro instanceof Vendedor) {
                lista.add((Vendedor) registro);
            }
        }
        return lista;
    }

}



