package PROIECT_FINAL.SortingStrategy;

import PROIECT_FINAL.Domain.Doctor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortBySpecialization implements ISortingStrategy {
    @Override
    public List<Doctor> sort(List<Doctor> list) {
        return list.stream()
                .sorted(Comparator.comparing(Doctor::getSpecialization))
                .collect(Collectors.toList());
    }
}