package ie.atu.labexam;

import jakarta.validation.constraints.*;
import jdk.jfr.Name;
import lombok.Data;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

public class Rental {
    @Pattern(regexp = "RENT-1234")
    private String rentalCode;

    @Max(value = 50, message = "Less than 50 characters ")
    private String carModel;

    @Max(value=100, message = "name cannot be blank or over 100 characters ")
    private String renterName;

    @Email(message = "Need to enter a valid email")
    private String renterEmail;

    @NotBlank(message= "must be today or in the future")
    private int rentalStartDate;

    @NotBlank(message= "must be after rental date ")
    private int rentalEndDate;

    @Min(value = 0, message = "has to be a positive value")
    private int decimal;


}
