package serviceImpl;

import entity.Employee;
import service.CommonService;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements CommonService<Employee>, EmployeeService {
    static List<Employee> employees = new ArrayList<Employee>();
    static {
        employees.add(new Employee(1,"Merdan Memmedov",46,"Bas kredit mutexessis","sifre1234","0554443322",4,"Kredit"));
        employees.add(new Employee(1,"Elmin Memmedov",33,"Kredit mutexessis","sifre2222","0552221100",2,"Xezine"));
    }
    @Override
    public void create(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void read(int id) {
        employees.get(id);
    }

    @Override
    public void update(int id, Employee employee) {
        delete(id);
        create(employee);
    }

    @Override
    public void delete(int id) {
        employees.remove(id);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }



    @Override
    public void updateAdVeVezife(int id, String ad, String vezife) {
        Employee employee = new Employee();
        employee = employees.get(id-1);
        employee.setName(ad);
        employee.setVezifesi(vezife);
    }

    @Override
    public void updateSifre(int id, String sifre) {
        Employee employee = new Employee();
        employee = employees.get(id-1);
        employee.setSifre(sifre);
    }

    @Override
    public List<Employee> bolmeUzreAxxtaris(String  bolme) {
        return  employees.stream().filter(bolmeAxtarisi->bolmeAxtarisi.getBolme().equals(bolme)).toList();

    }

    @Override
    public List<Employee> pensiyaYasi(int age) {

        return employees.stream()
                .map(m->new Employee(m.getId(),m.getName(),m.getYas(),m.getVezifesi(),m.getSifre(),m.getTelefonNomresi(),m.getTecrübeili(),m.getBolme())).filter(yas->yas.getYas()>=age-2).toList();
    }

    @Override
    public List<Employee> pensiyaYasi6(int age) {
        return employees.stream()
                .map(m->new Employee(m.getId(),m.getName(),m.getYas(),m.getVezifesi(),m.getSifre(),m.getTelefonNomresi(),m.getTecrübeili(),m.getBolme())).filter(yas->yas.getYas()>=age-6).toList();
    }


    @Override
    public List<Employee> tecrubeIli(String tecrube) {
        return employees.stream().filter(tecrubeili->tecrubeili.getTecrübeili()>2).toList();
    }
}