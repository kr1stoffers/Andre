package Lab2.Lab2_shkila;

import java.util.ArrayList;

/**
 * класс Конференция, который хранит объекты класса Ученик
 * 
 * @author Forgsom
 */

public class Conf {
    /**
     * список для хранения объектов Ученик
     */
    private ArrayList<Learner> masLE = new ArrayList<Learner>();

    /**
     * метод добавление объекта в список объектов Ученик
     * 
     */
    public void addLE(Learner m) {
        masLE.add(m);
    }

    /**
     * метод удаления объекта из списка объектов Ученик
     * 
     */
    public void removLE(int i) {
        masLE.remove(i);
    }

    /**
     * создает Конференцию без заданных параметров
     * 
     */
    public Conf() {
    }

    /**
     * конструктор класса
     * 
     * @param n список объектов Ученик
     */
    public Conf(ArrayList<Learner> n) {
        masLE = n;
    }

    /**
     * метод вывода всех объектов из класса Конференция
     * 
     */
    public void printConf() {
        System.out.println("В конференции: ");
        for (Learner a : masLE) { //
            System.out.println("\t" + a.toString());
        }
    }

    /**
     * метод для нахождения количества школьников и студентов и вывод результата на
     * экран
     * 
     */
    public void countLE() {
        Integer countSkolnic = 0;
        Integer countStudent = 0;
        for (Learner LE : masLE) {
            if (LE instanceof Skolnic) {
                countSkolnic++;
            } else {
                countStudent++;
            }
        }
        System.out.print("\t" + countSkolnic + " " + countStudent);
    }
}