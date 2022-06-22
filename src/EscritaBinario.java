import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscritaBinario {
    public static void escrever(String caminho,
                                String n,
                                int i, double p){
        try {
            FileOutputStream fos = new FileOutputStream(caminho);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(n);
            dos.writeInt(i);
            dos.writeDouble(p);
            dos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//
}
