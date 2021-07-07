package geekbrains.HomeWork5;

public class Personal {

    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Personal (String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("ФИО: " + this.fullName + " Должность: " + this.position + " Почта: " + this.email + " Телефон: " + this.phone + " Зарплата: " + this.salary + " Возраст: " + this.age);
    }


}
