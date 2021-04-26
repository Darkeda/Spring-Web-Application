package home.testing.demo.registerUser;

import home.testing.demo.appUser.AppUser;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@AllArgsConstructor
@RequestMapping(path = "register")
public class RegisterController {

    private final RegistrationService registrationService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping
    public void register(String username, String password, HttpServletResponse http) throws IOException {
        registrationService.signUp(
                new AppUser(
                        username,
                        passwordEncoder.encode(password)
                ));
        http.sendRedirect("/login");
    }
}
