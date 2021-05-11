package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web_model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO findById(UUID beerId) {
        return BeerDTO.builder()
                .id(beerId)
                .beerName("A test Beer")
                .beerStyle("IPA")
                .build();
    }

    @Override
    public BeerDTO save(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName(beerDTO.getBeerName())
                .beerStyle(beerDTO.getBeerStyle())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        return;
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("deleting a beer...");
        return;
    }
}
