import templatemethod.Pitcher1;
import templatemethod.Pitcher2;

public class TemplateMethod {
    public static void main(String[] args) {
        Pitcher1 pitcher1 = new Pitcher1();
        pitcher1.Pitching();
        System.out.println("\n");
        Pitcher2 pitcher2 = new Pitcher2();
        pitcher2.Pitching();
    }
}
