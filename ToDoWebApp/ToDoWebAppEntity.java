package net.mao.todowebapp;

import jakarta.persistence.*;

@Entity
@Table(name = "to_do_list", schema = "todowebapp")
public class ToDoWebAppEntity {


    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "item")
    private String item;
    @Basic
    @Column(name = "date_added")
    private String date_added;

    @Basic
    @Column(name = "date_completed")
    private String date_completed;

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

    public String getDateAdded() {
        return date_added;
    }

    public void setDateAdded(String date_added) {
        this.date_added = date_added;
    }

    public String getDateCompleted() {
        return date_completed;
    }

    public void setDateCompleted(String date_completed) {
        this.date_completed = date_completed;
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

        ToDoWebAppEntity that = (ToDoWebAppEntity) o;

        if (id != that.id) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (date_added != null ? !date_added.equals(that.date_added) : that.date_added != null) return false;
        if (date_completed != null ? !date_completed.equals(that.date_completed) : that.date_completed != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (date_added != null ? date_added.hashCode() : 0);
        result = 31 * result + (date_completed != null ? date_completed.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ToDoEntity{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", date added='" + date_added + '\'' +
                ", date completed='" + date_completed + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
