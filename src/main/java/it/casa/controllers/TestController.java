package it.casa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.casa.entities.Property;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/property")
	public List<Property> getFakeProperties() {
		List<Property> properties = new ArrayList<>();

		Property p1 = new Property();
		p1.setId(1);
		p1.setName("Appartamento Roma");
		p1.setDescription("Bellissimo appartamento in centro");
		p1.setLocation("Roma, Italia");
		p1.setPricePerNight(120.0);
		p1.setMaxGuests(4);

		Property p2 = new Property();
		p2.setId(2);
		p2.setName("Casa Milano");
		p2.setDescription("Casa moderna vicino alla metro");
		p2.setLocation("Milano, Italia");
		p2.setPricePerNight(150.0);
		p2.setMaxGuests(6);

		properties.add(p1);
		properties.add(p2);

		return properties;
	}

}
