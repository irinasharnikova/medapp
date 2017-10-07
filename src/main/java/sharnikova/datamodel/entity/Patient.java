package sharnikova.datamodel.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */
@Data
@Entity
@Table( name = "Patient" )
public class Patient {

    @Id
    @Column
    private long insuranceNumber;
    @Column
    private String surname;
    @Column
    private String name;
    @Column
    private Date birthday;
    @Column
    private String address;
    @Column
    private String diagnostic;
    @Column
    private String treatment;
}
