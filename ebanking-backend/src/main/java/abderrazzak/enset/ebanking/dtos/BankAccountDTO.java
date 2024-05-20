package abderrazzak.enset.ebanking.dtos;


import lombok.Data;
import abderrazzak.enset.ebanking.enums.AccountStatus;

import java.util.Date;


@Data
public class BankAccountDTO {
    private String ID;
    private String RIB;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customer;
    private String type;
}
