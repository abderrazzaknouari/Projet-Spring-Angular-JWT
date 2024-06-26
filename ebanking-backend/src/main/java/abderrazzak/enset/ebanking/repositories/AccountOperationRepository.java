package abderrazzak.enset.ebanking.repositories;

import abderrazzak.enset.ebanking.entities.AccountOperation;
import abderrazzak.enset.ebanking.entities.BankAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
    List<AccountOperation> findByBankAccountID(String id);
    List<AccountOperation> findByBankAccount(BankAccount bankAccount);

    Page<AccountOperation> findByBankAccountID(String id,Pageable pageable);


    Page<AccountOperation> findByBankAccountIDOrderByOperationDateDesc(String id, Pageable pageable);
}
