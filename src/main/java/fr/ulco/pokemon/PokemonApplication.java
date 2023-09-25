package fr.ulco.pokemon;

import fr.ulco.pokemon.services.AuthorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

    // Bean launched at the start of the app
    @Bean
    public CommandLineRunner run(final AuthorService authorService) {
        return (String[] args) -> {
            authorService.findNames()
                    .forEach(System.out::println);
        };
    }
}
