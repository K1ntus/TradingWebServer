package fr.neontus.trading.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.neontus.trading.control.routes.Index;

@RestController
public class TestController {


	@GetMapping("/")
	public String index() {
		return Index.processRouteIndex();
	}

}
