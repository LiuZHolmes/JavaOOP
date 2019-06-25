package model;

public class Student {
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String name;
    public int age;
    public char sex;
    public int number;

    public Student(String name_, int age_, char sex_, int number_) {
        name = name_;
        age = age_;
        sex = sex_;
        number = number_;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Sex: "+ sex + " Number: " + number;
    }


}
