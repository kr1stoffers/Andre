package Lab2.Lab2_shkila;

/**
 * класс студент дочерний класса Ученик
 * 
 * @author Forgsom
 */

public class Student extends Learner {
    /**
     * поле для хранения номера группы
     * 
     */
    private String group;
    /**
     * поле для хранения бюджета
     * 
     */
    private Boolean budget;
    /**
     * поле для хранения стипендии
     * 
     */
    private Boolean stipendiya;

    /**
     * метод для создания объекта класса без параметров с вызовом конструктора
     * родительского класса и установлением значений группы, бюджета и стипендии по
     * умолчанию
     */
    public Student() {
        super();
        group = "3114";
        budget = true;
        stipendiya = false;
    }

    /**
     * метод для создания объекта студент с значениями группы, бюджета и стипендии
     * вызывает конструктор родительского класса
     * 
     * @param name       имя
     * @param age        возраст
     * @param gender     гендер
     * @param group      группа
     * @param budget     бюджет
     * @param stipendiya стипендия
     */
    public Student(String name, Integer age, String gender, String group, Boolean budget, Boolean stipendiya) {
        super(name, age, gender);
        this.group = group;
        this.budget = budget;
        this.stipendiya = stipendiya;
    }

    /**
     * устанавливает значение поля {@link Skolnic#group}
     * 
     * @param group группа
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * устанавливает значение поля {@link Skolnic#budget}
     * 
     * @param budget бюджет
     */
    public void setBudget(Boolean budget) {
        this.budget = budget;
    }

    /**
     * устанавливает значение поля {@link Skolnic#stipendiya}
     * 
     * @param stipendiya стипендия
     */
    public void setStipendiya(Boolean stipendiya) {
        this.stipendiya = stipendiya;
    }

    /**
     * возвращает значение поля {@link Skolnic#group}
     * 
     * @return номер группы студента
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * возвращает значение поля {@link Skolnic#budget}
     * 
     * @return является ли студент на бюджетном месте или на платном
     */
    public Boolean isBudget() {
        return this.budget;
    }

    /**
     * возвращает значение поля {@link Skolnic#stipendiya}
     * 
     * @return выплачивается ли студенту стипендия
     */
    public Boolean isStipendiya() {
        return this.stipendiya;
    }

    /**
     * выводит все поля объекта
     * 
     * @return строка со всеми объектами
     */
    public String toString() {
        return getName() + " " + getAge() + " " + getGender() + " " + getGroup() + " " + isBudget() + " "
                + isStipendiya();
    }
}
