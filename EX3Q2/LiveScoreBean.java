import java.beans.*;
import java.io.Serializable;

public class LiveScoreBean implements Serializable {
    private String score;
    public static final String propertyName = "score";
    private PropertyChangeSupport properyChangeSupport;

    public LiveScoreBean(){
        properyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getScore(){
        return this.score;
    }

    public void setScore(String score){
        String oldScore = this.score;
        this.score = score;

        properyChangeSupport.firePropertyChange(propertyName, oldScore, this.score);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        properyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        properyChangeSupport.removePropertyChangeListener(listener);
    }
}
