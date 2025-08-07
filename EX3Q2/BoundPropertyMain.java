import java.util.Scanner;

public class BoundPropertyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScoreBean source = new LiveScoreBean();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        source.addPropertyChangeListener(subscriber1);
        source.addPropertyChangeListener(subscriber2);
        
        String inp = "";
        do{
            System.out.print("Enter Score: ");
            inp = sc.nextLine();
            if(inp.length() > 0) source.setScore(inp);
        }while(inp.length() > 0);
    }
}
