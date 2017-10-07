package sharnikova.service;

import sharnikova.datamodel.entity.Doctor;
import sharnikova.datamodel.entity.Speciality;

import java.util.List;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
public interface ClinicService {

    List<Doctor> getAllDoctors();

    List<Speciality> getSpecialities();
}
