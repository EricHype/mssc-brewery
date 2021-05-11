package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web_model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO findById(UUID beerId);

    BeerDTO save(BeerDTO beerDTO);

    void updateBeer(UUID beerId, BeerDTO beerDTO);

    void deleteBeer(UUID beerId);
}
