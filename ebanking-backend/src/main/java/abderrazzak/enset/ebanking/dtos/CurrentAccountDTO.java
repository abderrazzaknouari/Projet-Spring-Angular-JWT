package abderrazzak.enset.ebanking.dtos;

import lombok.Data;

@Data
public class CurrentAccountDTO extends BankAccountDTO {
    private double overDraft;
}
