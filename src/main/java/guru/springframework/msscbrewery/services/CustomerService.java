package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web_model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO findById(UUID customerId);

    CustomerDTO save(CustomerDTO customerDTO);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    void deleteCustomer(UUID customerId);
}
