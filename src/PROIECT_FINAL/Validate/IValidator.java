package PROIECT_FINAL.Validate;

import PROIECT_FINAL.Domain.Doctor;

public interface IValidator {
    void validate(Doctor doctor) throws ValidationException;
}
