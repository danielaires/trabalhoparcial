import java.util.Scanner;

public class Menu {
    public static int menu() {
        System.out.println("\n*******************************************");
        System.out.println("*          SELECIONE UMA OPÇÃO            *");
        System.out.println("*******************************************");
        System.out.println("*              1 - PESSOA                 *");
        System.out.println("*              2 - VEÍCULO                *");
        System.out.println("*              3 - REGISTRO-ALUGUEL       *");
        System.out.println("*              4 - VENDEDOR               *");
        System.out.println("*              5 - SAIR                   *");
        System.out.println("*******************************************\n");
        return new Scanner(System.in).nextInt();
    }

    public static int menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("\n*******************************************");
        System.out.println("*          SELECIONE UMA OPÇÃO            *");
        System.out.println("*******************************************");
        System.out.println("*              1 - Registrar              *");
        System.out.println("*              2 - Editar                 *");
        System.out.println("*              3 - Remover                *");
        System.out.println("*              4 - Listar                 *");
        System.out.println("*              5 - Sair                   *");
        System.out.println("*******************************************");
        opcao = sc.nextInt();
        return opcao;

    }
    public static int menuVeiculo(){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("\n*******************************************");
        System.out.println("*               VEICULO                    *");
        System.out.println("*******************************************");
        System.out.println("*              1 - Registrar              *");
        System.out.println("*              2 - Editar                 *");
        System.out.println("*              3 - Remover                *");
        System.out.println("*              4 - Listar                 *");
        System.out.println("*              5 - Sair                   *");
        System.out.println("*******************************************");
        opcao = sc.nextInt();
        return opcao;

    }


    public static int menuPessoa(){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("\n*******************************************");
        System.out.println("*               PESSOA                    *");
        System.out.println("*******************************************");
        System.out.println("*              1 - Registrar              *");
        System.out.println("*              2 - Editar                 *");
        System.out.println("*              3 - Remover                *");
        System.out.println("*              4 - Listar                 *");
        System.out.println("*              5 - Sair                   *");
        System.out.println("*******************************************");
        opcao = sc.nextInt();
        return opcao;

    }

    public static int menuRegistro(){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("\n*******************************************");
        System.out.println("*               REGISTRO                    *");
        System.out.println("*******************************************");
        System.out.println("*              1 - Registrar              *");
        System.out.println("*              2 - Editar                 *");
        System.out.println("*              3 - Remover                *");
        System.out.println("*              4 - Listar                 *");
        System.out.println("*              5 - Sair                   *");
        System.out.println("*******************************************");
        opcao = sc.nextInt();
        return opcao;

    }

    public static int menuVendedor(){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("\n*******************************************");
        System.out.println("*               VENDEDOR                    *");
        System.out.println("*******************************************");
        System.out.println("*              1 - Registrar              *");
        System.out.println("*              2 - Editar                 *");
        System.out.println("*              3 - Remover                *");
        System.out.println("*              4 - Listar                 *");
        System.out.println("*              5 - Sair                   *");
        System.out.println("*******************************************");
        opcao = sc.nextInt();
        return opcao;

    }
}//CLASS

