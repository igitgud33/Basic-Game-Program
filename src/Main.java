import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Layla objLayla = new Layla(2000);
        Balmond objBalmond = new Balmond(2000);

        objLayla.displayName();
        objBalmond.displayName();

        int round = 1;
        while(objLayla.getHp() > 0 && objBalmond.getHp() > 0) {
            System.out.println("\nROUND " + round);
            System.out.println("==================================");

            // SIMPLE AI ATTACK
            Random rndB = new Random();
            int attackB = rndB.nextInt(2) + 1; // 1 or 2
            int damageB = 0; // initializes Balmond's damage

            if(attackB == 1) {
                damageB = objBalmond.skill1();
            } else {
                damageB = objBalmond.skill2();
            }

            Random rndL = new Random();
            int attackL = rndL.nextInt(2) + 1; // 1
            int damageL = 0; // initializes Layla's damage

            if(attackL == 1) {
                damageL = objLayla.skill1();
            } else {
                damageL = objLayla.skill2();
            }


            // DAMAGE EFFECT
            objLayla.setHp(objLayla.getHp() - damageB);
            objBalmond.setHp(objBalmond.getHp() - damageL);

            System.out.println("----------------------------------");

            objLayla.displayName();
            objBalmond.displayName();

            round++;
        }

        if(objLayla.getHp() <= 0) {
            System.out.println("Balmond wins!");
        } else {
            System.out.println("Layla wins!");
        }
    }
}
