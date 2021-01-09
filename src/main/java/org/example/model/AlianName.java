package org.example.model;

import javax.persistence.Embeddable;

@Embeddable
public class AlianName {
    private String fname;
    private String lname;
    private String mname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    @Override
    public String toString() {
        return "AlianName{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
