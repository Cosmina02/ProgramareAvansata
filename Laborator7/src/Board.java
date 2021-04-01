import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Board {
List<Token>availableTokens;

    public Board(List<Token> availableTokens) {
        this.availableTokens = availableTokens;
    }

    public void displayTokens(){
        System.out.println(toString());
    }
    synchronized void chooseToken(Player p) throws IOException {
        if(!availableTokens.isEmpty()){
            System.out.println("Player "+p.name);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String name = reader.readLine();
            for(int i=0;i< availableTokens.size();i++){
                if(availableTokens.get(i).name.equals(name)){
                    p.setPlayersTokens(availableTokens.get(i));
                    availableTokens.remove(i);
                    break;
                }
            }
        }
        else{
            System.out.println("The board is empty,the game is finished!");
        }

    }

    @Override
    public String toString() {
        return "Board{" +
                "availableTokens=" + availableTokens +
                "\n}";
    }
}
