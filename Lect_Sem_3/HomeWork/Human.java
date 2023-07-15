package Lect_Sem_3.HomeWork;

public class Human {
    private String surname;
    private String name;
    private String fatherName;
    private String birthday;
    private String phoneNumber;
    private String sex;

    public Human(
    String surname, String name, String fatherName,
    String birthday, String phoneNumber, String sex){
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + fatherName + " " + birthday + " " + phoneNumber + " " + sex;
    }

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getFatherName() {
        return fatherName;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getSex() {
        return sex;
    }
}
