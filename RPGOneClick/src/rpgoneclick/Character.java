package rpgoneclick;
public class Character { // SUPERCLASSE
    public String Name;
    public int Strength;
    public int HealthPoits;
    public int Armor;
    
    public void Attack(int Strength,int HealthPoints){
        
    }
    public static int Dice(int dado){
        return (int)(Math.random() * dado + 1);
    }
    public boolean Run(){
       boolean run = false;
       if(Dice(20)>10){
           run = true;
       }
       return run;
    }
}
