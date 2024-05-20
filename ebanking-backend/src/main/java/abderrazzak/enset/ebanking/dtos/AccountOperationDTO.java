package abderrazzak.enset.ebanking.dtos;

import lombok.Data;
import abderrazzak.enset.ebanking.enums.OperationType;

import java.util.Date;


@Data
public class AccountOperationDTO {
    private Long ID;
    private Date operationDate;
    private double amount;
    private String description;
    private OperationType type;
}
