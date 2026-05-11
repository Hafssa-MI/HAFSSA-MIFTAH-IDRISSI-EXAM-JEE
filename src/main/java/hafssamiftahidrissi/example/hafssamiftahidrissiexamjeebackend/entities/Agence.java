package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.location;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String ville;

    private String adresse;

    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;

    @OneToMany(mappedBy = "agence")
    private List<location> locations;
}
