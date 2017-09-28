package datamodel.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
@Data
public class Visit {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dateOfVisit;
}
