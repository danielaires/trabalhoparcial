import java.util.List;
import java.util.Scanner;

public class CrudVeiculoView {


    public static void adicionar(BancoDao bancoDao, AuxID auxID){

        Scanner entrada = new Scanner(System.in);

        int id = auxID.gerarID();
        System.out.println("Digite nome do veiculo: ");
        String nome= entrada.next();
        System.out.println("Digite ano de fabrica: ");
        int ano= entrada.nextInt();
        System.out.println("Digite o status: ");
        String status = entrada.next();


        Veiculo v1 = new Veiculo(id,ano,nome,status);
        bancoDao.adicionar(v1);
    }


    public static void listar(BancoDao bancoDao){
        List<Veiculo> dados = bancoDao.listar();
        System.out.println(dados);

    }

    public static void atualizar(BancoDao bancoDao){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o id: ");
        int id = entrada.nextInt();
        System.out.println("Digite ano de fabrica: ");
        int ano= entrada.nextInt();
        System.out.println("Digite o nome do veiculo: ");
        String descricao = entrada.next();
        System.out.println("Digite o status: ");
        String status = entrada.next();
        Veiculo v1 = new Veiculo(id,ano,descricao,status);
        bancoDao.alterar(v1);

    }

    public static void remover(BancoDao bancoDao){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o id do Veiculo a ser removido");
        int id = Integer.parseInt(sc.next());
        bancoDao.remover(id);

    }

}
