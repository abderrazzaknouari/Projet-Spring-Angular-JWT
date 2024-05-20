package abderrazzak.enset.ebanking.repositories;

import abderrazzak.enset.ebanking.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFirstNameContainsOrLastNameContains(String firstName, String lastName);
}
