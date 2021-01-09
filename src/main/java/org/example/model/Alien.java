package org.example.model;

import javax.persistence.*;

@Entity//(name = "Alian_Table")
@Table//(name = "Alian_Table")
public class Alien {

    @Id
    @GeneratedValue
    private int aid;
    //@Transient               //use to avoid generate column with aname
    private AlianName aName;

    public void setaName(AlianName aName) {
        this.aName = aName;
    }

    //    private String aName;
//    @Column(name = "Alian_Color")
    private String color;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

//    public String getaName() {
//        return aName;
//    }
//
//    public void setaName(String aName) {
//        this.aName = aName;
//    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
