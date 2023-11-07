package com.lithan.ac.springboot_car_portal_demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lithan.ac.springboot_car_portal_demo.daos.CarRepository;
import com.lithan.ac.springboot_car_portal_demo.entities.Car;

@SpringBootTest
class CarMakeTest {

	@Autowired
	CarRepository carRepo;

	@Test
	void carMakeTest(){
		String make="Italy";
		List<Car> car=carRepo.searchBymake (make);
		assertFalse(car.isEmpty());

	}

}
