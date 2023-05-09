package dio.padroes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WellcomeController {

    @GetMapping
    public String wellcome() {
        return "Bem vindo ao projeto de fixação de padrôes de projetos com Spring Boot";
    }
}
