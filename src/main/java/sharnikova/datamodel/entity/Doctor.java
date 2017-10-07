package sharnikova.datamodel.entity;

import lombok.Data;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */

@Data
public class Doctor {

    private int id;
    private String surname;
    private String name;
    private Speciality speciality;
    private double personalRating;
}
