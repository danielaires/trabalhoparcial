import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaTexto {
    public static void escrever(String caminho,
                                String conteudo) {
        //File file = new File("arq.txt");
        try {
            FileWriter fw = new FileWriter(caminho,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(conteudo);
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//
    public static void escrever(String caminho,
                                byte[] conteudo) {
        //File file = new File("arq.txt");
        try {
            FileWriter fw = new FileWriter(caminho,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(conteudo);
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//
}