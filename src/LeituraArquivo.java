import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

    public static void ler(String caminho){
        try {
            FileReader fr = new FileReader(caminho);
            BufferedReader br = new BufferedReader(fr);
            String texto = null;
            StringBuilder sb = new StringBuilder();
            do{
                texto = br.readLine();
                if(texto!=null){
                    sb.append(texto).append("\n");
                }
            }while(texto!=null);
            br.close();
            fr.close();
            JOptionPane.showMessageDialog(
                    null,sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
