package com.ttt.jax_rs.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ttt.jax_rs.model.Car;


public class CarResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/car")
	public List<Car> getCars()
	{
		List<Car> listOfCars=new ArrayList<Car>();
		listOfCars=createCarList();
		
		return listOfCars;
	}
	
	@POST
	@Path("/create")
	public List<Car> createCarList() {
		Car bmw = new Car(1,"BMW");
		Car skoda = new Car(2,"SKODA");
		Car maruthi = new Car(3,"MARUTHI");
		Car benz = new Car(4,"BENZ");
		Car ford = new Car(5,"FORD");

		List<Car> listOfCars=new ArrayList<Car>();
		listOfCars.add(bmw);
		listOfCars.add(skoda);
		listOfCars.add(maruthi);
		listOfCars.add(benz);
		listOfCars.add(ford);
		return listOfCars;
	}
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Car getCarById(@PathParam("id") int id )
	{
		List<Car> listOfCars=new ArrayList<Car>();
		listOfCars=createCarList();
		for (Car car : listOfCars) {
			if(car.getId()==id) 
				return car;
		}
		return null;
	}
}
