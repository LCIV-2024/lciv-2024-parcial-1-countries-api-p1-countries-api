package ar.edu.utn.frc.tup.lciii.exception;

public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(String message) {
        super(message);
    }
}