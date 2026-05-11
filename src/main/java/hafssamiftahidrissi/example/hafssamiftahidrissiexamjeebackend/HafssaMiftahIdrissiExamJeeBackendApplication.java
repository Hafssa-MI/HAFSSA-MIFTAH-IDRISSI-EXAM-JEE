package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Agence;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Voiture;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.location;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.BoiteVitesse;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.StatutVehicule;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.TypeCarburant;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.AgenceRepository;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.LocationRepository;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootApplication
public class HafssaMiftahIdrissiExamJeeBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                HafssaMiftahIdrissiExamJeeBackendApplication.class,
                args
        );
    }

    @Bean
    CommandLineRunner start(
            AgenceRepository agenceRepository,
            VehiculeRepository vehiculeRepository,
            LocationRepository locationRepository
    ) {

        return args -> {

            Stream.of(
                    "Mohammedia",
                    "Casablanca",
                    "Rabat"
            ).forEach(ville -> {

                Agence agence = new Agence();

                agence.setNom("Agence " + ville);
                agence.setVille(ville);
                agence.setAdresse("Adresse " + ville);
                agence.setTelephone("0600000000");

                agenceRepository.save(agence);
            });

            agenceRepository.findAll().forEach(agence -> {

                Voiture voiture1 = new Voiture();

                voiture1.setMarque("Dacia");
                voiture1.setModele("Logan");
                voiture1.setAnnee(2022);
                voiture1.setPrixParJour(350);
                voiture1.setTypeCarburant(TypeCarburant.DIESEL);
                voiture1.setStatutVehicule(StatutVehicule.DISPONIBLE);
                voiture1.setNombrePortes(4);
                voiture1.setBoiteVitesse(BoiteVitesse.MANUELLE);
                voiture1.setClimatisation(true);
                voiture1.setAgence(agence);

                vehiculeRepository.save(voiture1);

                Voiture voiture2 = new Voiture();

                voiture2.setMarque("Renault");
                voiture2.setModele("Clio");
                voiture2.setAnnee(2023);
                voiture2.setPrixParJour(500);
                voiture2.setTypeCarburant(TypeCarburant.ESSENCE);
                voiture2.setStatutVehicule(StatutVehicule.DISPONIBLE);
                voiture2.setNombrePortes(5);
                voiture2.setBoiteVitesse(BoiteVitesse.AUTOMATIQUE);
                voiture2.setClimatisation(true);
                voiture2.setAgence(agence);

                vehiculeRepository.save(voiture2);
            });

            vehiculeRepository.findAll().forEach(vehicule -> {

                location location = new location();

                location.setNomClient("Client Test");
                location.setDateDebut(LocalDate.now());
                location.setDateFin(LocalDate.now().plusDays(5));
                location.setMontantTotal(
                        vehicule.getPrixParJour() * 5
                );
                location.setVehicule(vehicule);
                location.setAgence(vehicule.getAgence());

                locationRepository.save(location);
            });
        };
    }
}