package PROIECT_FINAL.DoctorRepository;

import PROIECT_FINAL.Domain.Doctor;

public interface ICollection {
    void add(Doctor doctor);
    void remove(Doctor doctor);
    ICollectionIterator iterator();
}