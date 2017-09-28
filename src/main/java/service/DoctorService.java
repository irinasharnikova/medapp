package service;

import datamodel.entity.Doctor;

import java.util.List;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
public interface DoctorService {

    void addDoctor(Doctor doctor);
    void deleteDoctor(int id);
    void updatePersonalInfo(int id);
    Doctor getDoctor(int id);
    List<Doctor> getAllDoctors();
}
