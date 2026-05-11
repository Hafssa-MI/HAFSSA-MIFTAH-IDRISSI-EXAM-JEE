package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.CasqueInclus;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.TypeMoto;
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
public class Moto extends Vehicule {

    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    @Enumerated(EnumType.STRING)
    private CasqueInclus casqueInclus;

    private int cylindree;
}
