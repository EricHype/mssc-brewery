package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web_model.BeerDTO;
import guru.springframework.msscbrewery.web_model.v2.BeerDTOV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDTOV2 findById(UUID beerId);

    BeerDTOV2 save(BeerDTOV2 beerDTO);

    void updateBeer(UUID beerId, BeerDTOV2 beerDTO);

    void deleteBeer(UUID beerId);
}
