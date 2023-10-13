package at.cicd2.lab4_registrationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/confirmRegisterUser")
    public String confirmDetails(@RequestBody UserDetails userDetails){
        String confirmationMessage = String.format("Received details for %s with email %s", userDetails.getName(), userDetails.getEmail());
        return confirmationMessage;
    }
}
