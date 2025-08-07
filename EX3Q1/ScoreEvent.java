import java.util.EventObject;

public class ScoreEvent extends EventObject{
    private String score;

    public ScoreEvent(Object scoreSource ,String score)
    {
        super(scoreSource);
        this.score = score;
    }

    public String getScore(){
        return this.score;
    }
}