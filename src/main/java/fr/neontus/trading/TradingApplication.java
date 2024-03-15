package fr.neontus.trading;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import fr.neontus.trading.model.asset.Asset;
import fr.neontus.trading.model.asset.AssetExchange;
import fr.neontus.trading.model.asset.AssetPrice;
import fr.neontus.trading.model.asset.AssetSector;
import fr.neontus.trading.model.asset.AssetSymbol;
import fr.neontus.trading.model.asset.AssetVolume;
import fr.neontus.trading.model.asset.EAssetSector;
import fr.neontus.trading.model.customer.Client;
import fr.neontus.trading.model.customer.Wallet;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TradingApplication {
	private static final String username = "test_username";

	public static void main(String[] args) {
		SpringApplication.run(TradingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Starting...");
			System.out.println("Initializing Customer...");
			Client customer = new Client(username);
			
			Wallet wallet_a = new Wallet();
			
			Asset asset_a = new Asset();
			Asset asset_b = new Asset();
			asset_b.setExchange(new AssetExchange("exchange_0"));
			asset_b.setPrice(new AssetPrice(4.2));
			asset_b.setSector(new AssetSector(EAssetSector.IT));
			asset_b.setSymbol(new AssetSymbol("TST"));
			asset_b.setVolume(new AssetVolume(5L));
			
			wallet_a.addAsset(asset_a);
			wallet_a.addAsset(asset_b);
			
			wallet_a.incrementAssetQuantity(asset_b, 30);
			
			
			customer.addWallet(wallet_a);
			
			System.out.println("Generated customer: " + customer);
			
			

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				// System.out.println(beanName);
			}

		};
	}

}