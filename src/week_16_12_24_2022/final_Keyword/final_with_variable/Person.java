package week_16_12_24_2022.final_Keyword.final_with_variable;

public class Person {
    private String name;
    final public String birthday;

    public Person(String birthday, String name) {
        this.birthday = birthday;
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

