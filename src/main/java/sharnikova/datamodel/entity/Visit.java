package sharnikova.datamodel.entity;

import lombok.Data;

import java.time.LocalDateTime;


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
