import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeituraBinario {
    public static void ler(String caminho){
        try {
            FileInputStream fis = new FileInputStream(caminho);
            DataInputStream dis = new DataInputStream(fis);
            String nome = dis.readUTF();
            int i = dis.readInt();
            double p = dis.readDouble();
            System.out.println(nome+ " "+i+" "+p);
            dis.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//
}
