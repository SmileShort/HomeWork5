package geekbrains.HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Ivanov Ivan", "Product manager", "IvanovII@rambler.ru", "89509630101", 70000, 45);
        persArray[1] = new Personal("Petrov Petr", "Manager", "PetrovPP@rambler.ru", "89509630102", 60000, 35);
        persArray[2] = new Personal("Sidorov Nikolay", "Ingineer", "SidorovNK@rambler.ru", "89509630103", 30000, 27);
        persArray[3] = new Personal("Mashkina Marina", "Human Resources Specialist", "MashkinaMA@rambler.ru", "89509630104", 45000, 41);
        persArray[4] = new Personal("Fedorova Antonina", "Accountant", "FedorovaAP@rambler.ru", "89509630105", 35000, 39);

        System.out.println("Введите интересующий Вас возраст: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();


        System.out.println("Данные сотрудники старше " + year + " лет: ");
        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age > year){
                persArray[i].info();
            }
        }

    }
}
