import java.beans.*;
import java.io.Serializable;

public class LiveScoreBean implements Serializable {
    private String scoreLine;
    public static final String propertyName = "scoreLine";
    private PropertyChangeSupport properyChangeSupport;

    public LiveScoreBean(){
        properyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getScore(){
        return this.scoreLine;
    }

    public void setScore(String scoreLine){
        String oldScore = this.scoreLine;
        this.scoreLine = scoreLine;
        properyChangeSupport.firePropertyChange(propertyName, oldScore, this.scoreLine);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        properyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        properyChangeSupport.removePropertyChangeListener(listener);
    }
}
