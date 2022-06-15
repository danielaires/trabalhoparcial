
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Banco banco = new Banco();
       BancoDao bancoDao =  new BancoDao(banco);
       AuxID auxID = new AuxID();

        int opcao = Menu.menu();

        //int op = Menu.menu();
        do {

//            switch(op){
//                case 1:
//                    CrudPessoaView.adicionar(bancoDao,auxID);
//                    op = Menu.menu();
//                    CrudPessoaView.atualizar(bancoDao);
//                    op = Menu.menu();
//                    CrudPessoaView.remover(bancoDao);
//                    op = Menu.menu();
//                    CrudPessoaView.listar(bancoDao);
//                    op = Menu.menu();
//                    break;
//                case 2:
//                    CrudVeiculoView.adicionar(bancoDao,auxID);
//                    op= Menu.menu();
//                    CrudVeiculoView.atualizar(bancoDao);
//                    op = Menu.menu();
//                    CrudVeiculoView.remover(bancoDao);
//                    op = Menu.menu();
//                    CrudVeiculoView.listar(bancoDao);
//                    op = Menu.menu();
//                    break;
//                case 3:
//                    CrudRegistroAluguelView.adicionar(bancoDao,auxID);
//                    op = Menu.menu();
//                    CrudRegistroAluguelView.atualizar(bancoDao,auxID);
//                    op = Menu.menu();
//                    CrudRegistroAluguelView.remover(bancoDao);
//                    op = Menu.menu();
//                    CrudRegistroAluguelView.listar(bancoDao);
//                    break;
//
//            }

            switch (opcao) {


                case 1:

                    CrudPessoaView.adicionar(bancoDao,auxID);
                    opcao = Menu.menu();
                    CrudVeiculoView.adicionar(bancoDao,auxID);
                    opcao= Menu.menu();
                    CrudRegistroAluguelView.adicionar(bancoDao,auxID);
                    opcao = Menu.menu();
                    break;
                case 2:
                    CrudPessoaView.atualizar(bancoDao);
                    opcao = Menu.menu();
                    CrudVeiculoView.atualizar(bancoDao);
                    opcao = Menu.menu();
                    CrudRegistroAluguelView.atualizar(bancoDao,auxID);
                    opcao = Menu.menu();
                    break;
                case 3:
                   // System.out.println("Digite o código da pessoa:\t");
                    CrudPessoaView.remover(bancoDao);
                    opcao = Menu.menu();
                    CrudVeiculoView.remover(bancoDao);
                    opcao = Menu.menu();
                    CrudRegistroAluguelView.remover(bancoDao);
                    opcao = Menu.menu();
                    break;
                case 4:
                    CrudPessoaView.listar(bancoDao);
                    opcao = Menu.menu();
                    CrudVeiculoView.listar(bancoDao);
                    opcao = Menu.menu();
                    CrudRegistroAluguelView.listar(bancoDao);
                    break;

            }
        } while (opcao != 5);

    }
}
