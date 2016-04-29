package jsf4;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean(name = "listenerBean")
@ViewScoped
public class ListenerBean implements Serializable {

   	private static final long serialVersionUID = -3066274619187180437L;
	private String color;
    private String event;

    public void submit() {
        System.out.println("submit");
    }

    public void listener(AjaxBehaviorEvent e) {
        System.out.println("listener");
        event = "called by " + e.getComponent().getClass().getName();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEvent() {
        return event;
    }

}
