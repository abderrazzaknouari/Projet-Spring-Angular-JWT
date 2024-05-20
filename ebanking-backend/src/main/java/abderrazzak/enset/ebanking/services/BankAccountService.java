package abderrazzak.enset.ebanking.services;

import abderrazzak.enset.ebanking.dtos.*;
import abderrazzak.enset.ebanking.exceptions.BankAccountNotFoundException;
import abderrazzak.enset.ebanking.exceptions.CustomerNotFoundException;
import abderrazzak.enset.ebanking.exceptions.InsufficientBalanceException;
import ma.enset.ebankingbackend.dtos.*;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customer);
    CurrentAccountDTO saveCurrentBankAccount(double balance, double overDraft, Long customerID) throws CustomerNotFoundException;
    SavingAccountDTO saveSavingBankAccount(double balance, double interestRate, Long customerID) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String id) throws BankAccountNotFoundException;
    void deposit(String id, double amount, String description) throws BankAccountNotFoundException;
    void withdraw(String id, double amount, String description) throws BankAccountNotFoundException, InsufficientBalanceException;
    void transfer(String idSource, String idDestination, double amount) throws BankAccountNotFoundException, InsufficientBalanceException;

    List<BankAccountDTO> listBankAccounts();

    CustomerDTO getCustomer(Long id) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long id) throws CustomerNotFoundException;
    List<AccountOperationDTO> accountOperationsHistory(String ID) throws BankAccountNotFoundException;

    AccountHistoryDTO accountOperationsHistory(String id, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);

    List<BankAccountDTO> getCustomerBankAccounts(Long id) throws CustomerNotFoundException;
}
