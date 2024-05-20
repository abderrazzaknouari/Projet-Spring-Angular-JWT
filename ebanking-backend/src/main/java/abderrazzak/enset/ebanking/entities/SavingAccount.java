package abderrazzak.enset.ebanking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@Data
@Entity
//@DiscriminatorValue("SA")
@NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount{
    private double interestRate;
    // Taux d'intérêt
}
