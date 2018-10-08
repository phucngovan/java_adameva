public class Human {
    private String name;
    private int age;
    private boolean gender;
    public Human() {
    }
    public Human(String name, boolean gender) {
        this.name=name;
        this.gender=gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void say(String word) {
        System.out.println(word);
    }
    public void eat(Apple apple) {
        apple.setWeight();
        System.out.println(this.name+" ăn 1 miếng");
    }
    public void sleep(){
        System.out.println(this.name+" đi ngủ");
    }

    public void born(){
        System.out.println(this.name+" đã sinh ra");
    }

}
