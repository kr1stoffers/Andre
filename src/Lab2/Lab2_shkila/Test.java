package Lab2.Lab2_shkila;

public class Test {
    public static void main(String[] args) {
        Conf conf = new Conf();
        Skolnic skolnik1 = new Skolnic("Петя", 13, "м", "6б", false);
        Skolnic skolnik2 = new Skolnic("Ваня", 17, "м", "11а", true);
        Skolnic skolnik3 = new Skolnic("Света", 15, "ж", "8в", false);

        Student student1 = new Student("YA", 21, "м", "3114", true, false);
        Student student2 = new Student("NEya", 20, "ж", "3102", true, true);

        conf.addLE(skolnik1);
        conf.addLE(skolnik2);
        conf.addLE(skolnik3);
        conf.addLE(student1);
        conf.addLE(student2);

        conf.printConf();
        conf.countLE();
    }
}
