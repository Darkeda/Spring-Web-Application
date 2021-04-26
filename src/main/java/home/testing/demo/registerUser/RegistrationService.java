package home.testing.demo.registerUser;

import home.testing.demo.appUser.AppUser;
import home.testing.demo.appUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final AppUserService appUserService;

    public void signUp(AppUser appUser) {
        appUserService.signUp(appUser);
    }
}
