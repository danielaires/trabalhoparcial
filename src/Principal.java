
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        //ControleMenu.controleMenu();

        //LeituraBinario.ler("arqBin.txt");
        //LeituraArquivo.ler(CAMINHO);

//        Relatorio r1 = new Relatorio();
//        r1.calcularAluguel();
//        r1.nomeVendedor();
//        r1.carroAlugado();

        Pessoa p = new Pessoa(1, 2018, "MARCOS PAULO");
        BancoDao.adicionar(p);
        gerarArquivoPessoas();


        Vendedor ved = new Vendedor(1, 2004, "Pedro");
        BancoDao.adicionar(ved);
        gerarArquivoVendedor();

        Veiculo v1 = new Veiculo(1,200,"Carro","Disponivel");
        BancoDao.adicionar(v1);
        gerarArquivoVeiculo();

        RegistroAluguel r = new RegistroAluguel(1, Calendar.getInstance(), 20, 5, 50, p,v1);
        BancoDao.adicionar(r);
        gerarArquivoRegistro();

    }

    public static void gerarArquivoPessoas() {
        StringBuilder conteudo = new StringBuilder();
        conteudo.append("ID    Nome            Ano\n");
        List<Pessoa> pesoas = BancoDao.listaPessoa();
        for (Pessoa p : pesoas) {
            conteudo.append(p.getId() + "   ");
            conteudo.append(p.getNome() + " ");
            conteudo.append(p.getAnoNascimento());
            conteudo.append("\n");
        }
        EscritaTexto.escrever("/home/ze/pessoas.txt", conteudo.toString());
        EscritaTexto.escrever("/home/ze/pessoas-binario.txt", conteudo.toString().getBytes());
    }


    public static void gerarArquivoVendedor() {
        StringBuilder conteudo = new StringBuilder();
        conteudo.append("ID    Nome      Ano\n");
        List<Vendedor> vendedor = BancoDao.listaVendedor();
        for (Vendedor ved : vendedor) {
            conteudo.append(ved.getId() + "   ");
            conteudo.append(ved.getNome() + " ");
            conteudo.append(ved.getAnoNascimento());
            conteudo.append("\n");
        }
        EscritaTexto.escrever("/home/ze/vendedor.txt", conteudo.toString());
        EscritaTexto.escrever("/home/ze/pessoas-binario.txt", conteudo.toString().getBytes());
    }


    public static void gerarArquivoRegistro() {
        StringBuilder conteudo = new StringBuilder();
        conteudo.append("ID  DATA  VALOR  QTDTEMPO    VALORTIPO       Ano\n");
        List<RegistroAluguel> registro = BancoDao.listaRegistro();
        for (RegistroAluguel r : registro) {
            conteudo.append(r.getId() + "    ");
            conteudo.append(r.getDataLocacao() + "   ");
            conteudo.append(r.getValorHora() + "   ");
            conteudo.append(r.getQtdTempo() + "   ");
            conteudo.append(r.getValorTipo() + "   ");
            conteudo.append(r.getPessoa() + "    ");
            conteudo.append(r.getVeiculo());
            conteudo.append("\n");
        }
        EscritaTexto.escrever("/home/ze/registro.txt", conteudo.toString());
    }

    public static void gerarArquivoVeiculo() {
        StringBuilder conteudo = new StringBuilder();
        conteudo.append("ID  ANOFABRICA   DESCRICAO     STATUS \n");
        List<Veiculo> veiculo = BancoDao.listaVeiculo();
        for (Veiculo veiculo1 : veiculo) {
            conteudo.append(veiculo1.getId() + "   ");
            conteudo.append(veiculo1.getAnoFabrica() + "   ");
            conteudo.append(veiculo1.getDescricao() + "    ");
            conteudo.append(veiculo1.getStatus());
            conteudo.append("\n");
        }
        EscritaTexto.escrever("/home/ze/veiculo.txt", conteudo.toString());
    }
}
