package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<location, Long> {
}
