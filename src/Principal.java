
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Banco banco = new Banco();
       BancoDao bancoDao =  new BancoDao(banco);
       AuxID auxID = new AuxID();

        int opc = Menu.menu();

        int op = Menu.menu();
        do {

            switch(op){
                case 1:
                    CrudPessoaView.adicionar(bancoDao,auxID);
                    op = Menu.menu();
                    CrudPessoaView.atualizar(bancoDao);
                    op = Menu.menu();
                    CrudPessoaView.remover(bancoDao);
                    op = Menu.menu();
                    CrudPessoaView.listar(bancoDao);
                    opc = Menu.menu();
                    break;
                case 2:
                    CrudVeiculoView.adicionar(bancoDao,auxID);
                    op= Menu.menu();
                    CrudVeiculoView.atualizar(bancoDao);
                    op = Menu.menu();
                    CrudVeiculoView.remover(bancoDao);
                    opc = Menu.menu();
                    CrudVeiculoView.listar(bancoDao);
                    opc = Menu.menu();
                    break;
                case 3:
                    CrudRegistroAluguelView.adicionar(bancoDao,auxID);
                    op = Menu.menu();
                    CrudRegistroAluguelView.atualizar(bancoDao,auxID);
                    op = Menu.menu();
                    CrudRegistroAluguelView.remover(bancoDao);
                    op = Menu.menu();
                    CrudRegistroAluguelView.listar(bancoDao);
                    break;

            }

            switch (opc) {


                case 1:

                    CrudPessoaView.adicionar(bancoDao,auxID);
                    opc = Menu.menu();
                    CrudVeiculoView.adicionar(bancoDao,auxID);
                    opc= Menu.menu();
                    CrudRegistroAluguelView.adicionar(bancoDao,auxID);
                    opc = Menu.menu();
                    break;
                case 2:
                    CrudPessoaView.atualizar(bancoDao);
                    opc = Menu.menu();
                    CrudVeiculoView.atualizar(bancoDao);
                    opc = Menu.menu();
                    CrudRegistroAluguelView.atualizar(bancoDao,auxID);
                    opc = Menu.menu();
                    break;
                case 3:
                   // System.out.println("Digite o código da pessoa:\t");
                    CrudPessoaView.remover(bancoDao);
                    opc = Menu.menu();
                    CrudVeiculoView.remover(bancoDao);
                    opc = Menu.menu();
                    CrudRegistroAluguelView.remover(bancoDao);
                    opc = Menu.menu();
                    break;
                case 4:
                    CrudPessoaView.listar(bancoDao);
                    opc = Menu.menu();
                    CrudVeiculoView.listar(bancoDao);
                    opc = Menu.menu();
                    CrudRegistroAluguelView.listar(bancoDao);
                    break;

            }
        } while (opc != 5);

    }
}
