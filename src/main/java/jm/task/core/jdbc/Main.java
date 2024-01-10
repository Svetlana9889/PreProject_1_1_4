package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();

        usi.createUsersTable();

        usi.saveUser("Ivan", "Ivanov", (byte) 33);
        System.out.println("Пользователь с именем Ivan добавлен в базу данных");
        usi.saveUser("Petr", "Petrov", (byte) 22);
        System.out.println("Пользователь с именем Petr добавлен в базу данных");
        usi.saveUser("Kolya", "Kolyanov", (byte) 23);
        System.out.println("Пользователь с именем Kolya добавлен в базу данных");
        usi.saveUser("Dima", "Dimanov", (byte) 32);
        System.out.println("Пользователь с именем Dima добавлен в базу данных");

        System.out.println(usi.getAllUsers());

        usi.cleanUsersTable();
        usi.dropUsersTable();
    }
}
