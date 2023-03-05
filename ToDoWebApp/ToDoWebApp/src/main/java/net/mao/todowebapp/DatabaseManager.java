package net.mao.todowebapp;

import entity.ToDoListEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

public class DatabaseManager {

    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static EntityTransaction transaction = entityManager.getTransaction();

    public static void enterItem(String item, String date_started, String status) {
        transaction.begin();
        ToDoListEntity todo = new ToDoListEntity();
        todo.setItem(item);
        todo.setDateAdded(date_started);
        todo.setStatus(status);
        entityManager.persist(todo);
        transaction.commit();
    }
    public static void enterItem(String item, String date_started, String date_completed, String status) {
        transaction.begin();
        ToDoListEntity todo = new ToDoListEntity();
        todo.setItem(item);
        todo.setDateAdded(date_started);
        todo.setDateCompleted(date_completed);
        todo.setStatus(status);
        entityManager.persist(todo);
        transaction.commit();
    }

    public static void deleteItem(String item) {
        transaction.begin();
        ToDoListEntity todo = new ToDoListEntity();
        todo = entityManager.find(ToDoListEntity.class,item);
        entityManager.remove(todo);
        transaction.commit();
    }
    public static void deleteItem(int id) {
        transaction.begin();
        ToDoListEntity todo = new ToDoListEntity();
        todo = entityManager.find(ToDoListEntity.class,id);
        entityManager.remove(todo);
        transaction.commit();
    }
//    public static void updateItem(String item) {
//        transaction.begin();
//        ToDoListEntity todo = new ToDoListEntity();
//        todo = entityManager.find(ToDoListEntity.class,item);
//        TypedQuery<ToDoListEntity> updateItemQuery = entityManager.createNamedQuery(
//                "updateItemQuery", ToDoListEntity.class);
//
//        entityManager.remove(todo);
//        transaction.commit();
//    }
//    public static void updateItem(int id) {
//
//    }
    public static void readTable() {
        String[] row = new String[5];
        transaction.begin();
        PrintTable.table.clear();
        int index = 0;
        TypedQuery<ToDoListEntity> printItemQuery = entityManager.createNamedQuery("printItemQuery", ToDoListEntity.class);
        for (ToDoListEntity item : printItemQuery.getResultList()) {
            row[0] = item.idToString();
            row[1] = item.itemToString();
            row[2] = item.dateAddedToString();
            row[3] = item.dateCompletedToString();
            row[4] = item.statusToString();
            PrintTable.table.put(index,row.clone());
            System.out.println(row[index]);
            index++;
            entityManager.persist(item);
        }
        transaction.commit();
    }
}
