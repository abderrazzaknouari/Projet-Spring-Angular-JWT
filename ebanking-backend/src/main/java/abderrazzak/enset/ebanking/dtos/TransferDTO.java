package abderrazzak.enset.ebanking.dtos;



@Data
public class TransferDTO {
    private String accountIDSource;
    private String accountIDDestination;
    private double amount;
    private String description;
}
