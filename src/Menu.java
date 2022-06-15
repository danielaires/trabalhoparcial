import java.util.Scanner;

import java.util.Scanner;

public class Menu {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("\n*******************************************");
        System.out.println("*          SELECIONE UMA OPÇÃO            *");
        System.out.println("*******************************************");
        System.out.println("*              1 - Registrar              *");
        System.out.println("*              2 - Editar                 *");
        System.out.println("*              3 - Remover                *");
        System.out.println("*              4 - Listar                 *");
        System.out.println("*              5 - Sair                   *");
        System.out.println("*******************************************");
        opc = sc.nextInt();
        return opc;
    }

}//CLASS

