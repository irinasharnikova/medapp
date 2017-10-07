package sharnikova.service;

import sharnikova.datamodel.entity.Patient;

import java.util.List;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
public interface PatientService {

    void addPatient( Patient patient );

    Patient getPatient(Long id);

    void deletePatient( Long id );

    void updatePatient(Patient patient );

    List<Patient> getPatients();

}
