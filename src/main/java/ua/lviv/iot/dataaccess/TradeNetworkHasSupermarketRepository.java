package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.AdvertismentPanel;
import ua.lviv.iot.domain.TradeNetworkHasSupermarket;

@Repository
public interface TradeNetworkHasSupermarketRepository extends JpaRepository<TradeNetworkHasSupermarket, Integer> {
}
