package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
