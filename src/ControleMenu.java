public class ControleMenu {
    public static void controleMenu() throws InterruptedException {
        int opcao;
        Banco banco = new Banco();
        BancoDao bancoDao = new BancoDao(banco);
        AuxID auxID = new AuxID();

        do {

            switch (Menu.menu()) {
                case 1:

                    do {
                        opcao = Menu.menuPessoa();
                        switch (opcao) {
                            case 1:
                                CrudPessoaView.adicionar(bancoDao, auxID);
                                opcao = Menu.menuPessoa();
                                break;
                            case 2:
                                CrudPessoaView.atualizar(bancoDao);
                                opcao = Menu.menuPessoa();

                                break;
                            case 3:
                                CrudPessoaView.remover(bancoDao);
                                opcao = Menu.menuPessoa();

                                CrudRegistroAluguelView.remover(bancoDao);
                                opcao = Menu.menu();
                                break;
                            case 4:
                                CrudPessoaView.listar(bancoDao);
                                opcao = Menu.menuPessoa();

                                CrudRegistroAluguelView.listar(bancoDao);
                                break;

                        }
                    } while (opcao != 5);
                    break;
                case 2:
                    do {
                        opcao = Menu.menuVeiculo();
                        switch (opcao) {
                            case 1:
                                CrudVeiculoView.adicionar(bancoDao, auxID);
                                opcao = Menu.menuVeiculo();

                                break;
                            case 2:
                                CrudVeiculoView.atualizar(bancoDao);
                                opcao = Menu.menuVeiculo();

                                break;
                            case 3:
                                CrudVeiculoView.remover(bancoDao);
                                opcao = Menu.menuVeiculo();

                                break;
                            case 4:
                                CrudVeiculoView.listar(bancoDao);
                                opcao = Menu.menuVeiculo();

                                break;

                        }
                    } while (opcao != 5);

                    break;
                case 3:
                    do {
                        opcao = Menu.menuRegistro();
                        switch (opcao) {
                            case 1:
                                CrudRegistroAluguelView.adicionar(bancoDao, auxID);
                                opcao = Menu.menu();
                                break;
                            case 2:
                                CrudRegistroAluguelView.atualizar(bancoDao, auxID);
                                opcao = Menu.menu();
                                break;
                            case 3:
                                CrudRegistroAluguelView.remover(bancoDao);
                                opcao = Menu.menu();
                                break;
                            case 4:
                                CrudRegistroAluguelView.listar(bancoDao);
                                break;
                        }
                    } while (opcao != 5);
//                case 4:
//                    do {
//                        opcao = Menu.menuVendedor();
//                        switch (opcao) {
//                            case 1:
//
//                        }
//                        System.out.print("Saindo ");
//                        for (int i = 10; i > 0; i--) {
//                            Thread.sleep(180);
//                            System.out.print(".");
//                        }
//                        System.exit(0);
//                        default:
//                            System.out.println("Digite uma entrada válida! ");
//                    } while (opcao != 5);
            }

        }while (true);

    }//class
}