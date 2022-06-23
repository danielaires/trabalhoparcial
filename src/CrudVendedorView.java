import java.util.List;
import java.util.Scanner;

public class CrudVendedorView {

    public static void adicionar(BancoDao bancoDao, AuxID auxID){

        Scanner entrada = new Scanner(System.in);

        int id = auxID.gerarID();
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        int ano = entrada.nextInt();
        System.out.println("Digite o valor da hora: ");
        double valor= entrada.nextDouble();
        System.out.println("Digite quantidade de horas: ");
        int qtd= entrada.nextInt();
        System.out.println("Digite a comissao: ");
        int comissao = entrada.nextInt();
        Vendedor v1 = new Vendedor(id,ano,nome);
        bancoDao.adicionar(v1);
    }

    public static void listar(BancoDao bancoDao){
        List<RegistroAluguel> dados = bancoDao.listaRegistro();
        System.out.println(dados);

    }
    public static void atualizar(BancoDao bancoDao,AuxID auxID){

        Scanner entrada = new Scanner(System.in);

        int id = auxID.gerarID();
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        int ano = entrada.nextInt();
        System.out.println("Digite o valor da hora: ");
        double valor= entrada.nextDouble();
        System.out.println("Digite quantidade de horas: ");
        int qtd= entrada.nextInt();
        System.out.println("Digite a comissao: ");
        int comissao = entrada.nextInt();
        Vendedor v1 = new Vendedor(id,ano,nome);
        bancoDao.alterar(v1);

    }

    public static void remover(BancoDao bancoDao){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o id a ser removido" );
        int id = Integer.parseInt(sc.next());
        bancoDao.remover(id);


    }//remover
}
