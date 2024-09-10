package model.entity;

import model.enums.EmployeePosition;
import model.enums.UserPosition;

public class User {
    private int id;
    private String name;
    private double borc;
    private int yas;
    private String telefonNomresi;
    private double kreditReytinqi;   //(10 bal skalası)
    private double AyliqGelir;       //(minimal emekhaqqi = 400)
    private UserPosition userPosition;

    public User(int id, String name, double borc, int yas, String telefonNomresi, double kreditReytinqi, double ayliqGelir, UserPosition userPosition) {
        this.id = id;
        this.name = name;
        this.borc = borc;
        this.yas = yas;
        this.telefonNomresi = telefonNomresi;
        this.kreditReytinqi = kreditReytinqi;
        AyliqGelir = ayliqGelir;
        this.userPosition = userPosition;
    }

    public User() {

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

    public double getBorc() {
        return borc;
    }

    public void setBorc(double borc) {
        this.borc = borc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTelefonNomresi() {
        return telefonNomresi;
    }

    public void setTelefonNomresi(String telefonNomresi) {
        this.telefonNomresi = telefonNomresi;
    }

    public double getKreditReytinqi() {
        return kreditReytinqi;
    }

    public void setKreditReytinqi(double kreditReytinqi) {
        this.kreditReytinqi = kreditReytinqi;
    }

    public double getAyliqGelir() {
        return AyliqGelir;
    }

    public void setAyliqGelir(double ayliqGelir) {
        AyliqGelir = ayliqGelir;
    }

    public UserPosition getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(UserPosition userPosition) {
        this.userPosition = userPosition;
    }

    @Override
    public String toString() {
        return "User{" +
                "AyliqGelir=" + AyliqGelir +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", borc=" + borc +
                ", yas=" + yas +
                ", telefonNomresi='" + telefonNomresi + '\'' +
                ", kreditReytinqi=" + kreditReytinqi +
                ", userPosition=" + userPosition +
                '}';
    }
}
