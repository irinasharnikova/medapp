package sharnikova.service;

import sharnikova.datamodel.dao.GenericDaoImpl;
import sharnikova.datamodel.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author Irina Sharnikova
 *         irina.sharnikova@yandex.ru
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    @Autowired
    private GenericDaoImpl<Patient, Long> patientDao;

    @Transactional
    public void addPatient(Patient patient) {
        patientDao.create(patient);
    }

    public List<Patient> getPatients() {
        return patientDao.getAll();
    }

    public Patient getPatient(Long id) {
        return patientDao.get(id);
    }

    public void deletePatient(Long id) {
        patientDao.delete(id);
    }

    public void updatePatient(Patient patient) {
        patientDao.update(patient);
    }
}
