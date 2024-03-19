package fr.neontus.trading.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.neontus.trading.control.routes.DashboardRoutes;
import fr.neontus.trading.control.routes.IndexRoutes;
import fr.neontus.trading.control.routes.SummaryRoutes;

@RestController
public class TestController 
{

	

	@GetMapping("/")
	public String index() 
	{
		return IndexRoutes.processRouteIndex();
	}
	
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return DashboardRoutes.getData();
	}
	
	@GetMapping("/summary")
	public String summary()
	{
		return SummaryRoutes.getData();
	}
	
	@GetMapping("/order")
	public String order()
	{
		return "";
	}

}
