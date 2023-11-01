package com.example.nameinfofinder;

import com.example.nameinfofinder.dto.AgeResponse;
import com.example.nameinfofinder.dto.GenderResponse;
import com.example.nameinfofinder.dto.NationalityResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.sql.SQLOutput;

@Configuration
public class RemoteAPI implements CommandLineRunner {

    // Get Gender for name
    Mono<GenderResponse> getGenderForName(String name) {
        WebClient webClient = WebClient.create();

        Mono<GenderResponse> genderResponseMono = webClient.get()
                .uri("https://api.genderize.io?name=" + name)
                .retrieve()
                .bodyToMono(GenderResponse.class);

        return genderResponseMono;
    }

    // Get Age for name
    Mono<AgeResponse> getAgeForName(String name) {
        WebClient webClient = WebClient.create();
        
        Mono<AgeResponse> ageResponseMono = webClient.get()
                .uri("https://api.agify.io?name=" + name)
                .retrieve()
                .bodyToMono(AgeResponse.class);
        
        return ageResponseMono;
    }

    // Get Nationality for name
    
    Mono<NationalityResponse> getNationalityForName(String name){
        WebClient webClient = WebClient.create();
        
        Mono<NationalityResponse> nationalityResponseMono = webClient.get()
                .uri("https://api.nationalize.io?name=" + name)
                .retrieve()
                .bodyToMono(NationalityResponse.class);
        
        return nationalityResponseMono;
    }

    @Override
    public void run(String... args) throws Exception {

        //Mono<Gender> resultForParker = getGenderForName("parker");
        //System.out.println(resultForParker.block().getGender());

        String name = "Steffen";

        // Get name for Steffen
        Mono<GenderResponse> resultForSteffen = getGenderForName(name);
        System.out.println(resultForSteffen.block().getGender());

        // Get age for Steffen
        Mono<AgeResponse> ageResultForSteffen = getAgeForName(name);
        System.out.println(ageResultForSteffen.block().getAge());
        
        // Get nationality for Steffen
        Mono<NationalityResponse> nationalityResultForSteffen = getNationalityForName(name);
        System.out.println(nationalityResultForSteffen.block().getCountry().size());
                


    }


}
