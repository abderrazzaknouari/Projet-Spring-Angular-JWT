package abderrazzak.enset.ebanking.web;

import abderrazzak.enset.ebanking.dtos.BankAccountDTO;
import abderrazzak.enset.ebanking.dtos.CustomerDTO;
import abderrazzak.enset.ebanking.exceptions.CustomerNotFoundException;
import abderrazzak.enset.ebanking.services.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class CustomerRESTController {
    private BankAccountService bankAccountService;

    @GetMapping("/customers")
    public List<CustomerDTO> customers() {
        return bankAccountService.listCustomers();
    }

    @GetMapping("customers/search")
    public List<CustomerDTO> searchCustomers(@RequestParam(name = "keyword") String keyword) {
        return bankAccountService.searchCustomers(keyword);
    }
    @GetMapping("/customers/{id}")
    public CustomerDTO getCustomer(@PathVariable(name = "id") Long id) throws CustomerNotFoundException {
        return bankAccountService.getCustomer(id);
    }

    @PostMapping("/customers")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO) {
        return bankAccountService.saveCustomer(customerDTO);
    }


    @PutMapping("/customers/{id}")
    public CustomerDTO updateCustomer(@PathVariable Long id,@RequestBody CustomerDTO customerDTO) {
        customerDTO.setID(id);
        return bankAccountService.updateCustomer(customerDTO);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id) throws CustomerNotFoundException {
        bankAccountService.deleteCustomer(id);
    }

    @GetMapping("/customers/{id}/bankAccounts")
    public List<BankAccountDTO> getCustomerBankAccounts(@PathVariable Long id) throws CustomerNotFoundException {
        return bankAccountService.getCustomerBankAccounts(id);
    }
}
