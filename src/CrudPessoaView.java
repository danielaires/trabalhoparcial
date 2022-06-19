import java.awt.*;
import java.util.Scanner;
import java.util.List;

public class CrudPessoaView {
      public static void adicionar(BancoDao bancoDao, AuxID auxID){

        Scanner entrada = new Scanner(System.in);

        int id = auxID.gerarID();
        System.out.println("Digite o nome: ");
        String nome= entrada.nextLine();
        System.out.println("Digite ano de nascimento: ");
        int ano= entrada.nextInt();
        Pessoa p1 = new Pessoa(id,ano,nome);
        bancoDao.adicionar(p1);
    }

    public static void listar(BancoDao bancoDao){
        List<Pessoa> dados = bancoDao.listar();
        System.out.println(dados);

    }


    public static void atualizar(BancoDao bancoDao){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome= entrada.nextLine();
        System.out.println("Digite id: ");
        int id= entrada.nextInt();
        System.out.println("Digite ano de nascimento: ");
        int ano= entrada.nextInt();
        Pessoa p1 = new Pessoa(id,ano,nome);
        bancoDao.alterar(p1);

    }

    public static void remover(BancoDao bancoDao){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o id a ser removido" );
        int id = Integer.parseInt(sc.next());
        bancoDao.remover(id);


    }//remover

}//class
