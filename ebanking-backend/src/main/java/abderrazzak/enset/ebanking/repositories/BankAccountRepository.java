package abderrazzak.enset.ebanking.repositories;

import abderrazzak.enset.ebanking.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> findByCustomerID(Long ID);
}
