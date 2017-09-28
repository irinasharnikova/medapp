package datamodel.entity;

import lombok.Data;

import java.util.List;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
@Data
public class Clinic {
    private int id;
    private String name;
    private List<Speciality> specialities;
    private List<Doctor> doctors;
    private double rating;
}
