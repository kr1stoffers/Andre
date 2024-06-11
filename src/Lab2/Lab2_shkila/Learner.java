package Lab2.Lab2_shkila;

// Базовый класс – учащийся. Производные – школьник и студент. Создать класс Конференция, который может
// содержать оба вида учащихся.Предусмотреть метод подсчета участников конференции отдельно по школьникам и по студентам(использовать оператор instanceof).
/**
 * базовый класс
 * 
 * @author Forgsom
 * 
 * 
 */
public class Learner {
    private String name;
    private Integer age;
    private String gender;

    /**
     * @param name имя
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param age возраст
     * 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @param gender гендер
     * 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return имя ученика
     * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return возраст ученика
     * 
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @return гендер ученика
     * 
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * конструктор класса без параметров
     */
    public Learner() {
        this.name = "Не известно";
        this.age = 6;
        this.gender = "Не известно";
    }

    /**
     * 
     * @param name   имя
     * @param age    возраст
     * @param gender гендер
     */
    public Learner(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
