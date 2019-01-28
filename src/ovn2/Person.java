package ovn2;

public class Person {

//    public static final int FEMALE = 1;
//    public static final int MALE = 2;

    String name;
    String occupation;
    int age;
    int length;
    Sex sex;
    House house;

    public Person(String name, String occupation, int age, int length, Sex sex, House house) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.length = length;
        this.sex = sex;
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                ", length=" + length +
                ", sex=" + sex +
                ", house=" + house +
                '}';
    }
}