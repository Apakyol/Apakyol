package week_16_12_24_2022.final_Keyword.final_with_variable;

public class TestPerson {
    public static void main(String[] args) {
        Person person=new Person("18031973","Abdulhamid");

        // final keyword is given, you cant change birthday. person.birthday="18031983";
        person.setName("Abdullah");//because not define final, so we can change name
        System.out.println(person);

    }
}
