import java.util.Date;

public class Animal {
    String name;
    Date dateB;
    Env env;
    Food food;

    public String getName() {
        return this.name;
    }

    public void getName(String name) {
        if(name.length() >=3) {
            this.name = name;
        }
    }

    public Date getDateB() {
        return this.dateB;
    }

    public void getDateB(Date) {
        return this.dateB;
    }

}
