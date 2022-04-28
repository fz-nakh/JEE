package emsi.g1g11.patients1mvc;

import emsi.g1g11.patients1mvc.entities.Patient;
import emsi.g1g11.patients1mvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Patients1MvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Patients1MvcApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
return args -> {

    patientRepository.save(new Patient(null,"fati",new Date(),false,142));
    patientRepository.save(new Patient(null,"fati1",new Date(),true,121));
    patientRepository.save(new Patient(null,"fati2",new Date(),false,122));
    patientRepository.save(new Patient(null,"fati3",new Date(),false,123));
    patientRepository.findAll().forEach(p->{System.out.println(p.getNom());});
};

    }

}
