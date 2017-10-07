package sharnikova.service;

import sharnikova.datamodel.entity.Visit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
public interface VisitService {

    void planVisit( Visit visit );

    void cancelVisit( LocalDateTime date, int patientId, int doctorId );

    Date shiftVisit( LocalDateTime date, long insuranceNumber );

    Date shiftVisit( int patientId );

    List<Visit> getAllPlanedVisits( LocalDate date );
}
