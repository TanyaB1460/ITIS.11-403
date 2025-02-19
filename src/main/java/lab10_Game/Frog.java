package lab10_Game;
import java.util.Random;

public class Frog extends Entity{
    public Frog() {}

    public Frog(int x, int y) {
        super("Лягушка", x, y);
    }

    @Override
    public void move(){
        Random r = new Random();
        int direction = r.nextInt(4);

        switch (direction){
            case 0:
                if (y > 0){
                    y -= 2;
                }
                break;
            case 1:
                if (x < fieldWidth){
                    x += 2;
                }
                break;
            case 2:
                if (y < fieldHeight){
                    y += 2;
                }
                break;
            case 3:
                if (x > 0){
                    x -= 2;
                }
                break;
        }
    }
}
