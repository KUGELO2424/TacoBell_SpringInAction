package pl.study.TacoBell;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {

    @NotBlank(message = "Podanie imienia i nazwiska jest obowiązkowe")
    private String name;
    @NotBlank(message = "Podanie ulicy jest obowiązkowe")
    private String street;
    @NotBlank(message = "Podanie miejscowosci jest obowiązkowe")
    private String city;
    @NotBlank(message = "Podanie wojewodztwa jest obowiazkowe")
    private String state;
    @NotBlank(message = "Podanie kodu pocztowego jest obowiazkowe")
    private String zip;
    @CreditCardNumber(message = "To nie jest prawidłowy numer karty kredytowej")
    private String ccNumber;
    @Pattern(regexp="^([0-1][0-9])([/])([1-9][0-9])$",
            message = "Wartosc musi byc w formacie MM/RR")
    private String ccExpiration;
    @Digits(integer=3, fraction = 0, message = "Nieprawidłowy kod CVV")
    private String ccCVV;

}