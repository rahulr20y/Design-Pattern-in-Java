package com.designpattern.learningdesignpattern.creational.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("It is used when we have to create only 1 instance of a class");
        /***
         * 4 ways to achieve this
         * 1. Eager
         * 2. Lazy
         * 3. Synchronized Method
         * 4. Double Locking
         */

        DBConnectionEager connectionEager = DBConnectionEager.getInstance();
        DBConnectionLazy connectionLazy = DBConnectionLazy.getInstance();
        DBConnectionSynchronized connectionSynchronized = DBConnectionSynchronized.getInstance();
        DBConnectionDoubleLocking connectionDoubleLocking = DBConnectionDoubleLocking.getInstance();
    }
}

// 1. Eager Initialization
class DBConnectionEager {
    private static DBConnectionEager connection = new DBConnectionEager();

    private DBConnectionEager() { // making constructor as private to prevent it from calling outside of class
    }

    public static DBConnectionEager getInstance() {
        return connection;
    }
}

// 2. Lazy initialization
class DBConnectionLazy {
    private static DBConnectionLazy connection;

    private DBConnectionLazy() {

    }

    public static DBConnectionLazy getInstance() {
        if (connection == null) {// issue if multiple threads come simultaneously
            connection = new DBConnectionLazy();
        }
        return connection;
    }
}

// 3. Synchronized Method

class DBConnectionSynchronized {
    private static DBConnectionSynchronized connection;

    private DBConnectionSynchronized() {

    }

    synchronized public static DBConnectionSynchronized getInstance() { // method synchronized
        if (connection == null) {
            connection = new DBConnectionSynchronized();
        }
        return connection;
    }
}

// 4. Double Locking - used in industry
class DBConnectionDoubleLocking {
    private static DBConnectionDoubleLocking connection;

    private DBConnectionDoubleLocking() {

    }

    public static DBConnectionDoubleLocking getInstance() {
        if (connection == null) {
            synchronized (DBConnectionDoubleLocking.class) { // block synchronized
                if (connection == null) {
                    connection = new DBConnectionDoubleLocking();
                }
            }
        }
        return connection;
    }
}