import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable {
    String name;
   List<Token> playersTokens = new ArrayList<>();
   Board b;
   Thread t;

    public Player(String name,Board b) {
        this.name = name;
        this.b=b;
    }
    public void printTokens(){
        System.out.println(toString());
    }
    public void setPlayersTokens(Token newToken) {
        playersTokens.add(newToken);
    }

    public void run(){
        while(!b.availableTokens.isEmpty()){
            try {
                b.displayTokens();
                b.chooseToken(this);
                Thread.sleep(100);
            } catch (IOException | InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        printTokens();

    }
    public void start(){
        if (t == null) {
            t = new Thread (this, name);
            t.start ();
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playersTokens=" + playersTokens +
                '}';
    }
}
