package jsf4;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean implements Serializable {

   private static final long serialVersionUID = 56791L;

   private String name;
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public String getWelcomeMessage(){
      return "Witaj, " + name;
   }
}

