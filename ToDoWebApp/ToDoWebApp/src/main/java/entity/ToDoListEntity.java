package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@NamedQuery(name="printItemQuery", query="SELECT i FROM ToDoListEntity i")
@NamedQuery(name="deleteItemQuery", query="DELETE FROM ToDoListEntity WHERE id = ?1")
@Table(name = "to_do_list", schema = "todowebapp")
public class ToDoListEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "item")
    private String item;

    //@ColumnDefault("'(curdate())'")
    @Basic
    @Column(name = "date_added")
    private String dateAdded;
    @Basic
    @Column(name = "date_completed")
    private String dateCompleted;
    @Basic
    @Column(name = "status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDoListEntity that = (ToDoListEntity) o;

        if (id != that.id) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (dateCompleted != null ? !dateCompleted.equals(that.dateCompleted) : that.dateCompleted != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateCompleted != null ? dateCompleted.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", date_added='" + dateAdded + '\'' +
                ", date_completed='" + dateCompleted + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public String idToString() {
        return "" + id;
    }
    public String itemToString() {
        return item;
    }
    public String dateAddedToString() {
        return dateAdded;
    }
    public String dateCompletedToString() {
        return dateCompleted;
    }
    public String statusToString() {
        return status;
    }

}
