package emsi.g1g11.patients1mvc.repositories;

import emsi.g1g11.patients1mvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

Page<Patient> findByNomContains(String Kw, Pageable pageable);

}
