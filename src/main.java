import model.Children;
import model.Hobby;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Hobby> hobby1 =new ArrayList<>();
        Hobby h1=new Hobby("chess","internal");
        Hobby h2=new Hobby("badminton","external");
        hobby1.add(h1);
        hobby1.add(h2);
        ArrayList<Hobby> hobby2 =new ArrayList<>();
        Hobby h3=new Hobby("Swimming","external");
        Hobby h4=new Hobby("Football","external");
        hobby2.add(h3);
        hobby2.add(h4);

        Children child1=new Children("acharya","meemansha",12,18, hobby1);
        Children child2=new Children("paudel","manan",11,12,hobby2);

         child1.format();


    }
}
