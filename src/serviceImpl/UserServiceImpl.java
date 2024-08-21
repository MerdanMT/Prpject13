package serviceImpl;

import entity.User;
import service.CommonService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements CommonService<User>, UserService {
    static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adil Emirov", 2500, 31, "0515554433", 9.2, 1300));
        users.add(new User(1, "Kamran Veliyev", 900, 23, "0778887799", 8.7, 1800));
    }

    @Override
    public void create(User user) {
        users.add(user);
    }

    @Override
    public void read(int id) {
        users.get(id);
    }

    @Override
    public void update(int id, User user) {
        delete(id);
        create(user);
    }

    @Override
    public void delete(int id) {
        users.remove(id);
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    //////////////////////

    @Override
    public List<User> kreditPozitivBorc(double borc) {
        return users.stream().filter(pul->pul.getBorc()<borc).toList();
    }

    @Override
    public List<User> kreditPozitivYas(int yasMin, int yasMax) {
        return users.stream().filter(age->age.getYas()>yasMin&&age.getYas()<yasMax).toList();
    }

    @Override
    public List<User> ayliqQazanc(double qazanc) {
        return users.stream().filter(pul->pul.getAyliqGelir()>=qazanc).toList();
    }

    @Override
    public List<User> reytinqFiltr(double reytinq) {
        return users.stream().filter(bal->bal.getKreditReytinqi()>=reytinq).toList();
    }

    @Override
    public List<User> prefiksFilt(String prefiks) {
        return users.stream().filter(nomre->nomre.getTelefonNomresi().startsWith(prefiks)).toList();
    }

    @Override
    public List<User> nameFiltr(String name) {
        return users.stream().filter(ad->ad.getName().contains(name)).toList();
    }

    @Override
    public List<User> yetkinlik(int age) {
        return users.stream().filter(yas->yas.getYas()>=age+2).toList();
    }

    @Override
    public List<User> borc1000Az(int borc_1000) {
        return users.stream().filter(borc->borc.getBorc()<=borc_1000).toList();
    }
}
