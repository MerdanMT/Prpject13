package service;

import model.entity.Employee;

import java.util.List;

public interface EmployeeService {
        void updateAdVeVezife(int id, String  ad,String vezife);
        void updateSifre(int id,String sifre);
        List<Employee> bolmeUzreAxxtaris(String bolme);
        List<Employee> pensiyaYasi(int age);
        List<Employee> pensiyaYasi6(int age);
        List<Employee> tecrubeIli(String tecrube);
}
