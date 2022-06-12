package com.arkaa99.SpringMVCform.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@ToString
@Entity
public class Employee {
    private String name;
    private String email;

    @Id
    @Column(name = "ID", nullable = false)
    private Integer ID;
    private String designation;

    public Employee() {

    }

    public Employee(String name, String email, Integer ID, String designation) {
        this.name = name;
        this.email = email;
        this.ID = ID;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (ID != employee.ID) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        return designation != null ? designation.equals(employee.designation) : employee.designation == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + ID;
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        return result;
    }

}
