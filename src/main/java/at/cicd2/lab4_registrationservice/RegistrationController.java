package at.cicd2.lab4_registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private NotificationServiceClient notificationServiceClient;

    @Autowired
    public RegistrationController(NotificationServiceClient notificationServiceClient){
        this.notificationServiceClient = notificationServiceClient;
    }

    @PostMapping("/confirmRegisterUser")
    public String confirmDetails(@RequestBody UserDetails userDetails){
        String confirmationMessage = notificationServiceClient.notificationMessage(userDetails);
        return confirmationMessage;
    }
}
