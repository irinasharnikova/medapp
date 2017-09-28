package datamodel.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;


/**
 * @author Irina Sharnikova
 * irina.sharnikova@yandex.ru
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public enum Speciality {
    Anestesiology,
    Pediatrics,
    Neurlogy,
    Dermatology,
    FamilyMedicine,
    Surgery
}
