package service;

import entity.User;

import java.util.List;

public interface UserService {
    List<User> kreditPozitivBorc(double borc);
    List<User> kreditPozitivYas(int yasMin, int yasMax);
    List<User> ayliqQazanc(double qazanc);
    List<User> reytinqFiltr(double reytinq);
    List<User> prefiksFilt(String prefiks);
    List<User> nameFiltr(String name);
    List<User> yetkinlik(int age);
    List<User> borc1000Az(int borc_1000);
}
