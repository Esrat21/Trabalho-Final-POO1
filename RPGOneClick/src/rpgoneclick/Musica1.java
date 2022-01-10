package rpgoneclick;

import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.decoder.JavaLayerException;

public class Musica1 {
     javazoom.jl.player.advanced.AdvancedPlayer playMP3;
    public Musica1(File Dir){
        try{
            FileInputStream fis = new FileInputStream(Dir);
            playMP3 = new javazoom.jl.player.advanced.AdvancedPlayer(fis);
            
            System.out.println("a");
            
        }
        catch(Exception exc){
            exc.printStackTrace();
            System.out.println("Failed to play the file.");
        }
    }
    
    public void iniciaMusica() throws JavaLayerException{
        playMP3.play();
    }
    
    public void paraMusica(){
        playMP3.close();
    }
}
