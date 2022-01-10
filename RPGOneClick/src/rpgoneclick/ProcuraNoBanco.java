
package rpgoneclick;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ProcuraNoBanco {
    
    public String search(String nick,int quant) throws IOException {
       int cont =0;
       String linha = null;
        try {
      FileReader arqt = new FileReader("C:\\Users\\jgmda\\OneDrive\\Área de Trabalho\\Banco\\"+nick+".txt");
      BufferedReader lerArq = new BufferedReader(arqt);
       while (cont <quant) {
       linha = lerArq.readLine();
       }
       return linha;
        }catch (FileNotFoundException ex) {
        return null;
        }
    }
}
