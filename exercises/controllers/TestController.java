package it.test.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import it.test.entities.Property;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/property")
    public List<Property> getFakeProperty() {
        List<Property> properties = new ArrayList<>();

        Property p1 = new Property();
        p1.setId(1);
        p1.setNome("Casa a Roma");
        p1.setDescrizione("Casa a Roma con piscina");
        p1.setLocalita("Roma");
        p1.setPrezzoPerNotte(200.0);
        p1.setMaxOspiti(6);

        Property p2 = new Property();
        p2.setId(2);
        p2.setNome("Appartameto a Roma");
        p2.setDescrizione("Appartamento grande e luminoso");
        p2.setLocalita("Roma");
        p2.setPrezzoPerNotte(100.0);
        p2.setMaxOspiti(4);

        properties.add(p1);
        properties.add(p2);

        return properties;
    }

}
