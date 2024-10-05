package ar.edu.utn.frc.tup.lciii.controllers;
import ar.edu.utn.frc.tup.lciii.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

}