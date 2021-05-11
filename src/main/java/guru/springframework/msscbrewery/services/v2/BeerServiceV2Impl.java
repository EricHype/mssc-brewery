package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web_model.v2.BeerDTOV2;
import guru.springframework.msscbrewery.web_model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDTOV2 findById(UUID beerId) {
        return BeerDTOV2.builder()
                .id(beerId)
                .beerName("A test Beer")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDTOV2 save(BeerDTOV2 beerDTO) {
        return BeerDTOV2.builder()
                .id(UUID.randomUUID())
                .beerName(beerDTO.getBeerName())
                .beerStyle(beerDTO.getBeerStyle())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOV2 beerDTO) {

    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("deleting a beer...");
        return;
    }
}
