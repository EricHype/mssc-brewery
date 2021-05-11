package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web_model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO findById(UUID customerId) {
        return CustomerDTO.builder()
                .id(customerId)
                .name("Bob")
                .build();
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name(customerDTO.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
        return;
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        return;
    }
}
