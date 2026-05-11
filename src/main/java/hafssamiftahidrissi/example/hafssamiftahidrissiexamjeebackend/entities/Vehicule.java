package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.StatutVehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.StatutVehicule;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.TypeCarburant;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;

    private String modele;

    private double prixParJour;

    private int annee;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statutVehicule;

    @ManyToOne
    private Agence agence;
}
