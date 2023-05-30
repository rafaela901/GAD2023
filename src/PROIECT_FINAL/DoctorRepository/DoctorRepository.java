package PROIECT_FINAL.DoctorRepository;
import java.util.ArrayList;
import java.util.List;
import PROIECT_FINAL.Domain.Doctor;

public class DoctorRepository implements ICollection {
    private List<Doctor> repo;

    public DoctorRepository() {
        this.repo = new ArrayList<>();
    }

    @Override
    public void add(Doctor doctor) {
        this.repo.add(doctor);
    }

    @Override
    public void remove(Doctor doctor) {
        this.repo.remove(doctor);
    }

    @Override
    public ICollectionIterator iterator() {
        return new CollectionIterator(this.repo);
    }

    public List<Doctor> getAll() {
        return this.repo;
    }
}