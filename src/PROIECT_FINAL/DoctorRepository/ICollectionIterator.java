package PROIECT_FINAL.DoctorRepository;

import PROIECT_FINAL.Domain.Doctor;

public interface ICollectionIterator {
    boolean hasNext();
    Doctor next();
    Doctor currentPosition();
}