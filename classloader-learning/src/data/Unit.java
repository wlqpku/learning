package data;

public class Unit {

    private String        id;
    // true=male, false=female
    private boolean       gender;
    private String        name;
    private int           age;
    private StringBuilder description;

    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "XmlObject [id=" + id + ",gender=" + gender + ", name=" + name + ", age=" + age + ", description="
               + description + "]";
    }

}
