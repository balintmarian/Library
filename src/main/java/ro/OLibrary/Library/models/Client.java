package ro.OLibrary.Library.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Table(name="clients")
public class Client {
    @Id
    @Column (name="id")
    private int id;
    @Column (name="first_name")
    private String first_name;
    @Column (name="last_name")
    private String last_name;
    @Column (name="phone")
    private String phone;
    @Column (name="budget")
    private BigDecimal budget;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Client() {
    }

    public Client(int id, String first_name, String last_name, String phone, BigDecimal budget) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.budget = budget;
    }

}
