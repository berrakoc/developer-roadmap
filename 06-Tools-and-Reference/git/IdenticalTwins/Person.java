import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of Person, the objects are not the same
        if (!(compared instanceof Person)) {
            return false;
        }

        // let's cast the object to Person
        Person otherPerson = (Person) compared;

        // if all the values are the same, the objects are the same
        if (       this.name.equals(otherPerson.name)
                && this.birthday.equals(otherPerson.birthday)
                && this.height == otherPerson.height
                && this.weight == otherPerson.weight) {
            return true;
        }

        // otherwise, the objects are not the same
        return false;
    }
}
