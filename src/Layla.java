import java.util.Random;

public class Layla extends Character {
    private int hp;

    public Layla(int hp) {
        this.hp = hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void displayName() {
        System.out.println("LAYLA");

        if(hp <= 0) {
            setHp(0);
        }

        System.out.println("HP : " + getHp());
        System.out.println("----------------------------------");
    }

    @Override
    public int skill1() {
        Random rnd = new Random();
        int damageSkill1 = rnd.nextInt(351); // ranges from 0 to 350
        
        System.out.println("Layla used Skill 1 (Malefic Bomb!) and dealt " + damageSkill1 + " damage!\n");
        
        return damageSkill1;

    }

    @Override
    public int skill2() {
        Random rnd = new Random();
        
        int min = 330, max = 350;
        int damageSkill1 = rnd.nextInt(max-min) + min; 
        
        System.out.println("Layla used Skill 2 (Void!) and dealt " + damageSkill1 + " damage!\n");
        
        return damageSkill1;

    }
    
}
