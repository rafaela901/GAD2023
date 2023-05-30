package PROIECT_FINAL.SortingStrategy;

import PROIECT_FINAL.Domain.Doctor;

import java.util.List;

public interface ISortingStrategy {
    List<Doctor> sort(List<Doctor> list);
}