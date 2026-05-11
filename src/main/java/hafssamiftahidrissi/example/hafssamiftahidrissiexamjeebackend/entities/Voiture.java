package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.BoiteVitesse;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Voiture extends Vehicule {

    private int nombrePortes;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;

    private boolean climatisation;
}
