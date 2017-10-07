package sharnikova.service;

import sharnikova.datamodel.dao.GenericDaoImpl;
import sharnikova.datamodel.entity.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


/**
 * @author Irina Sharnikova
 *
 * irina.sharnikova@yandex.ru
 */
@Repository
public class VisitServiceImpl implements VisitService {

    @Autowired
    private GenericDaoImpl<Visit, Integer> visitDao;

    public void planVisit( Visit visit ) {
        visitDao.create( visit );
    }

    public void cancelVisit( LocalDateTime date, int insuranceNumber, int doctorId ) {
        visitDao.getAll()
                .stream()
                .filter( v -> v.getDateOfVisit().equals( date ) )
                .filter( v -> insuranceNumber == v.getPatient().getInsuranceNumber() )
                .filter( v -> doctorId == v.getDoctor().getId() );
    }

    public Date shiftVisit(LocalDateTime date, long insuranceNumber) {
        return null;
    }

    @Override
    public Date shiftVisit( int patientId ) {
        return null;
    }

    @Override
    public List<Visit> getAllPlanedVisits( LocalDate date ) {
        return null;
    }
}
