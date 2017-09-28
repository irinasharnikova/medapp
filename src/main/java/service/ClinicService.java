package service;

import datamodel.entity.Doctor;
import datamodel.entity.Speciality;

import java.util.List;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
public interface ClinicService {

    List<Doctor> getAllDoctors();

    List<Speciality> getSpecialities();
}
