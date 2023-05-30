package PROIECT_FINAL;

import PROIECT_FINAL.DoctorRepository.DoctorRepository;
import PROIECT_FINAL.Service.Service;
import PROIECT_FINAL.UI.UserInterface;
import PROIECT_FINAL.Validate.Validator;

public class Main {
    public static void main(String[] args) {

        DoctorRepository repo = new DoctorRepository();
        Validator validator = new Validator();
        Service service = new Service(repo,validator);
        UserInterface ui = new UserInterface(service);
        ui.start();
    }
}