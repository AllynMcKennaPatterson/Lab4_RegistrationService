package at.cicd2.lab4_registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification", url = "http://localhost:8083")
public interface NotificationServiceClient {
    @PostMapping("/confirmRegisterUser")
    String someDetails(@RequestBody UserDetails userDetails);
}