package home.testing.demo.templateController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(path = "home")
public class MainPageTest {
  //  private Principal principal;

    @GetMapping()
    public String hello(Principal principal){
        return"Hello "+ principal.getName();
    }
}