import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MyThread implements Runnable {
    Player p;
    List<Token> availableTokens= new ArrayList<>();
    Thread t;
    MyThread(Player p){
       this.p=p;
        t=new Thread(this,p.name);
        System.out.println("New Thread: "+t);
        int[] values1 = {1, 2};
        Token tok1=new Token("Tok1",values1);
        int[] values2 = {2,4};
        Token tok2=new Token("Tok2",values2);
        int[] values3 = {5,4};
        Token tok3=new Token("Tok3",values3);
        int[] values4 = {7,1};
        Token tok4=new Token("Tok4",values4);
        availableTokens.add(tok1); availableTokens.add(tok2);
        availableTokens.add(tok3);availableTokens.add(tok4);

        t.start();
    }
public synchronized void run(){
        System.out.println(this.p.name);
        Thread.yield();
        PrintTokens();
        System.out.println("Choose what token you want by it's name");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            String name = reader.readLine();
            assignTokens(name);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    System.out.println(p.name+" existing");
    }


    private void PrintTokens(){
        for(int j=0;j<availableTokens.size();j++){
            System.out.println(availableTokens.get(j).toString());
        }
    }
    private void assignTokens(String name){
        for(int i=0;i<=availableTokens.size();i++)
        {
            if(availableTokens.get(i).name.equals(name)){
                p.setPlayersTokens(availableTokens.get(i));
                availableTokens.remove(i);
                break;
            }
        }
    }

}
