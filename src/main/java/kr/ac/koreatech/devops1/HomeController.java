package kr.ac.koreatech.devops1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

  @GetMapping("/")
  public String index() {
      return "home";
  }
  
}
