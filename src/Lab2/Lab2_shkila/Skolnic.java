package Lab2.Lab2_shkila;

/**
 * класс школьник дочерний класса Ученик
 * 
 * @author Forgsom
 * 
 */
public class Skolnic extends Learner {
    /**
     * поле для хранение цифры и буквы класса
     */
    private String klass;
    /**
     * поле для хранения активности
     */
    private Boolean after_school;

    /**
     * конструктор для создания объекта класса без параметров с вызовом конструктора
     * родительского класса и установлением значений класса и активности по
     * умолчанию
     */
    public Skolnic() {
        super();
        klass = "1a";
        after_school = false;
    }

    /**
     * конструктор для создания объекта школьник с значениями класса, активности и
     * вызывает конструктор родительского класса
     * 
     * @param name         имя
     * @param age          возраст
     * @param gender       гендер
     * @param klass        класс
     * @param after_school продленка
     */
    public Skolnic(String name, Integer age, String gender, String klass, Boolean after_school) {
        super(name, age, gender);
        this.klass = klass;
        this.after_school = after_school;
    }

    /**
     * устанавливает значение поля {@link Skolnic#klass}
     * 
     * @param klass класс
     * 
     */
    public void setKlass(String klass) {
        this.klass = klass;
    }

    /**
     * устанавливает значение поля {@link Skolnic#after_school}
     * 
     * @param after_school продленка
     * 
     */
    public void setAfter_school(Boolean after_school) {
        this.after_school = after_school;
    }

    /**
     * возвращает значение поля {@link Skolnic#klass}
     * 
     * @return класс обучающего в виде строки
     */
    public String getKlass() {
        return this.klass;
    }

    /**
     * 
     * возвращает значение поля {@link Skolnic#after_school}
     * 
     * @return занимается ли ученик вне учебное время
     */
    public Boolean isAfter_school() {
        return this.after_school;
    }

    /**
     * выводит все поля объекта
     * 
     * @return строка со всеми значениями объекта
     */
    public String toString() {
        return getName() + " " + getAge() + " " + getGender() + " " + getKlass() + " " + isAfter_school();
    }
}
