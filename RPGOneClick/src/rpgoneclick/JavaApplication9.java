
package rpgoneclick;
public class JavaApplication9 {

    public static void main(String[] args) {
        Monstro m = new Monstro(100);
        Player p = new Player(100, 5, 5, 5, 5, 5, 5);
        int dano;
        boolean morto=false;
        for(int i=0; i<10 && morto==false;i++){
            System.out.println("player:");
            System.out.println(dano=p.getDanoDaArma());
            m.setVida(dano);
            if(m.getVida()<=0){
                System.out.println("Monstro morto!!!!");
                 morto=true;
            }
            else{
                System.out.println("Monsto:");
                System.out.println(dano= m.getDano());
                p.setVida(dano);
                if(p.getVida()<=0){
                    System.out.println("Player morto!!!");
                    morto=true;
                }
                
            }
            System.out.println("");
        }

    }
    
}
