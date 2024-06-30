package src.oop;

import static java.lang.System.out;

public class Jvm {
    public static void main(String[] args) {
//        out.print()
        print_to_console("JAVA APP STARTED");
//        String long_chars = "haha xd lol";
//        add_prefix(long_chars);
//        var h = new Humane();
//        h.active = true;
//        h.gender = 'M';
//        h.score = 100;
//        h.tall = 160.00f;
//        print_to_console(h.human_state());
    }

    static void add_prefix(String obj) {
        print_to_console(obj + "_copy");
    }
    public static void print_to_console(Object obj) {
        out.println(obj);
    }
}

class Humane {
    int weight;
    long score;
    char gender;
    float tall;
    boolean active;

    String human_state() {
        return "Humane{" +
                "weight=" + weight +
                ", score=" + score +
                ", gender=" + gender +
                ", tall=" + tall +
                ", active=" + active +
                '}';
    }
}
