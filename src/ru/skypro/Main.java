package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }
    public static void task1() {
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//        вторая задача
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);

//        третья задача
        String fullNameSemicolon = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameSemicolon);

//        четвертая задача,
    }
    public static void task2(){
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameYoYe = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameYoYe);
    }

    public static void task3(){

    }
    public static void task4(){

    }
    public static void task5(){

    }
    public static void task6(){

    }
}
