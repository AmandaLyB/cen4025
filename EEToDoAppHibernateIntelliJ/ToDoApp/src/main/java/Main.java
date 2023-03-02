import entity.ToDoEntity;
import jakarta.persistence.*;

import java.util.Scanner;

public class Main {

    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static EntityTransaction transaction = entityManager.getTransaction();

    public static void enterItem(long id, String item, String status) {
        transaction.begin();
        ToDoEntity todo = new ToDoEntity();
        todo.setId(id);
        todo.setItem(item);
        todo.setStatus(status);
        entityManager.persist(todo);
        transaction.commit();
    }

    public static void deleteID(Long id) {
        transaction.begin();
        ToDoEntity todo = new ToDoEntity();
        todo = entityManager.find(ToDoEntity.class,id);
        entityManager.remove(todo);
        transaction.commit();
    }


    // print entire table
    public static void readList() {

        transaction.begin();
        TypedQuery<ToDoEntity> printItemQuery = entityManager.createNamedQuery("printItemQuery", ToDoEntity.class);
        //printItemQuery.setParameter(1, "add methods");
        for (ToDoEntity item : printItemQuery.getResultList()) {
            System.out.println(item.toString());
        }
        transaction.commit();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Long id;
        String item, status, userInput;

        System.out.println("p to print todo list, c to create new item");
        System.out.println("d to delete item, i to delete an id, q to quit");

        while (true){
            System.out.println("Enter option p, c, d, or q: ");
            userInput = scan.next();
            if (userInput.equals("q")) {
                scan.close();
                break;
            }
            if (userInput.equals("p")){
                readList();
            }
            if (userInput.equals("c")) {
                System.out.println("Enter ID");
                id = scan.nextLong();
                scan.nextLine();
                System.out.println("Enter item");
                item = scan.nextLine();
                System.out.println("Enter status");
                status = scan.nextLine();
                enterItem(id, item, status);
                System.out.println("Entered id:" + id + " item: " + item + " status: " + status);
            }
            if (userInput.equals("d")) {
                System.out.println("Enter item to delete");
                id = scan.nextLong();
                deleteID(id);
                System.out.println("Deleted " + id.toString());
            }
        }
    }
}
