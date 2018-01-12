package main.java.com.airport.baggage;

import main.java.com.airport.baggage.Baggage;
import main.java.com.airport.util.Route;
import main.java.com.airport.util.RoutingItem;


public interface Router {
	
	public   Route<Baggage> route(RoutingItem<Baggage> routingItem);

}
