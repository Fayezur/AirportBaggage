package main.java.com.airport.util;

import main.java.com.airport.util.Route;


public interface ShorestPathAlgorithm {
	
	public <I> Route<I> getShortestPath(Vertex source , Vertex destination);

}
