package abderrazzak.enset.ebanking.dtos;

import lombok.Data;

@Data
public class DepositDTO {
    private String accountID;
    private double amount;
    private String description;
}
