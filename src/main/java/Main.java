import com.denis.controller.Controller;
import com.denis.model.Model;
import com.denis.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
