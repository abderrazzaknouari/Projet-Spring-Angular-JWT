package abderrazzak.enset.ebanking.dtos;

import lombok.Data;

@Data
public class WithdrawDTO {
    private String accountID;
    private double amount;
    private String description;
}
