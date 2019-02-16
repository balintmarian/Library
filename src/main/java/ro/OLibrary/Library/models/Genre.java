package ro.OLibrary.Library.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="genre")
public class Genre {
    @Id
    @Column(name="id")
    private int id;
    @Column (name="name")
    private String name;
    @ManyToMany(mappedBy = "genres")
    private Set<Book> books = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre() {
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
