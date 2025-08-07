import java.util.ArrayList;
import java.util.List;

public class ScoreSource{
    private String score;
    private List<ScoreListener> listener;
    
    public ScoreSource(){
        listener = new ArrayList<>();
    }

    public void setScoreLine(String newScore){
        this.score = newScore;
        ScoreEvent ev = new ScoreEvent(this, newScore);
        fireScoreEvent(ev);
    }

    public String getScore(){
        return this.score;
    }

    public void addScoreListener(ScoreListener listener){
        this.listener.add(listener);
    }

    public void removeScoreListener(ScoreListener listener){
        this.listener.remove(listener);
    }

    public void fireScoreEvent(ScoreEvent event){
        for(int i = 0; i < listener.size();i++){
            listener.get(i).scoreChange(event);
        }
    }
}
