package exercise5;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int average;

    public Student(String name, int age, int average) throws InvalidAgeException, InvalidNoteException {
        setName(name);
        setAge(age);
        setAverage(average);
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

    public void setAge(int age) throws InvalidAgeException {
        int min = 18;
        int max = 26;
        if (age < min || age > max) {
            throw new InvalidAgeException(this.name, min, max);
        }
        this.age = age;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) throws InvalidNoteException {
        int min = 0;
        int max = 20;
        if (average < min || average > max) {
            throw new InvalidNoteException(this.name, min, max);
        }
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                average == student.average &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, average);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", average=" + average +
                '}';
    }
}
