public abstract class Character {
    private int hp; // instance var (global) 
    
    public void setHp(int hp) { // setter method
        this.hp = hp;   
    }

    public int getHp() { // getter method
        return hp;
    }

    public abstract void displayName();
    public abstract int skill1();
    public abstract int skill2();
}
