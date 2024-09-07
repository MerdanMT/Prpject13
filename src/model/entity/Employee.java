package model.entity;

import model.enums.EmployeePosition;

public class Employee {
    private int id;
    private String name;
    private int yas; //(pensiya 65)
    private String vezifesi;
    private String sifre;
    private String telefonNomresi;
    private int tecrübeili;
    private String bolme;
    public EmployeePosition position;

    public Employee(int id, String name, int yas, String vezifesi, String sifre, String telefonNomresi, int tecrübeili, String bolme, EmployeePosition position) {
        this.id = id;
        this.name = name;
        this.yas = yas;
        this.vezifesi = vezifesi;
        this.sifre = sifre;
        this.telefonNomresi = telefonNomresi;
        this.tecrübeili = tecrübeili;
        this.bolme = bolme;
        this.position=position;
    }

    public Employee() {
    }

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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getVezifesi() {
        return vezifesi;
    }

    public void setVezifesi(String vezifesi) {
        this.vezifesi = vezifesi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelefonNomresi() {
        return telefonNomresi;
    }

    public void setTelefonNomresi(String telefonNomresi) {
        this.telefonNomresi = telefonNomresi;
    }

    public int getTecrübeili() {
        return tecrübeili;
    }

    public void setTecrübeili(int tecrübeili) {
        this.tecrübeili = tecrübeili;
    }

    public String getBolme() {
        return bolme;
    }

    public void setBolme(String bolme) {
        this.bolme = bolme;
    }

    public EmployeePosition getPosition() {
        return position;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yas=" + yas +
                ", vezifesi='" + vezifesi + '\'' +
                ", sifre='" + sifre + '\'' +
                ", telefonNomresi='" + telefonNomresi + '\'' +
                ", tecrübeili=" + tecrübeili +
                ", bolme='" + bolme + '\'' +
                ", position=" + position +
                '}';
    }
}
