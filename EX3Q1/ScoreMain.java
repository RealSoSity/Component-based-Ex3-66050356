import java.util.Scanner;

public class ScoreMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSource scoreSource = new ScoreSource();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        scoreSource.addScoreListener(subscriber1);
        scoreSource.addScoreListener(subscriber2);
        String inp = "";
        do{
            System.out.print("Enter Score: ");
            inp = sc.nextLine();
            if(inp.length() > 0) scoreSource.setScoreLine(inp);
        }while(inp.length() > 0);
    }
}
