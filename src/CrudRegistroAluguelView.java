import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CrudRegistroAluguelView {

    static void adicionar(BancoDao bancoDao, AuxID auxID){

        Scanner entrada = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        int id = auxID.gerarID();
        System.out.println("Data e Hora atual: "+c.getTime());
        System.out.println("Digite valor da hora: ");
        double valor= entrada.nextDouble();
        System.out.println("Digite quantidade do tempo: ");
        double qtd = entrada.nextDouble();
        System.out.println("Digite o valor do tipo de veiculo: ");
        double tipo = entrada.nextDouble();
        System.out.println("Digite nome da pessoa: ");
        String pessoa = entrada.next();
        Pessoa p = new Pessoa();
        p.setNome(pessoa);
        System.out.println("Digite o veiculo: ");
        String veiculo = entrada.next();
        Veiculo v = new Veiculo();
        v.setDescricao(veiculo);

       RegistroAluguel r1 = new RegistroAluguel(id,c,valor,qtd,tipo,p,v);
       bancoDao.adicionar(r1);

    }


    static void listar(BancoDao bancoDao){
        List<RegistroAluguel> dados = bancoDao.listar();
        System.out.println(dados);

    }

    static void remover(BancoDao bancoDao){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o id do Registro a ser removido: ");
        int id = Integer.parseInt(sc.next());
        bancoDao.remover(id);

    }

    static void atualizar(BancoDao bancoDao,AuxID auxID){

        Scanner entrada = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        int id = auxID.gerarID();
        System.out.println("Data e Hora atual: "+c.getTime());
        System.out.println("Digite valor da hora: ");
        double valor= entrada.nextDouble();
        System.out.println("Digite quantidade do tempo: ");
        double qtd = entrada.nextDouble();
        System.out.println("Digite o valor do tipo de veiculo: ");
        double tipo = entrada.nextDouble();
        System.out.println("Digite nome da pessoa: ");
        String pessoa = entrada.next();
        Pessoa p = new Pessoa();
        p.setNome(pessoa);
        System.out.println("Digite o veiculo: ");
        String veiculo = entrada.next();
        Veiculo v = new Veiculo();
        v.setDescricao(veiculo);

        RegistroAluguel r1 = new RegistroAluguel(id,c,valor,qtd,tipo,p,v);
        bancoDao.alterar(r1);

    }
}



