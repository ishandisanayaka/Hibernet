package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    @GeneratedValue
    private int lapid;
    private String LapName;

    @ManyToMany
    private List<Student> students=new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    //    @ManyToOne
//    private Student student;

    public int getLapid() {
        return lapid;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lapid=" + lapid +
                ", LapName='" + LapName + '\'' +
                '}';
    }

    public void setLapid(int lapid) {
        this.lapid = lapid;
    }

    public String getLapName() {
        return LapName;
    }

    public void setLapName(String lapName) {
        LapName = lapName;
    }
}
