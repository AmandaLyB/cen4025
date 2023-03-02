package entity;

import jakarta.persistence.*;

@Entity
@NamedQuery(name = "printItemQuery", query = "SELECT i FROM ToDoEntity i")
@NamedQuery(name = "deleteIDQuery", query = "DELETE FROM ToDoEntity WHERE id= ?1")
@Table(name = "to_do", schema = "todolist")
public class ToDoEntity {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "item")
    private String item;
    @Basic
    @Column(name = "status")
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItem(String s) {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

        ToDoEntity that = (ToDoEntity) o;

        if (id != that.id) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ToDoEntity{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
