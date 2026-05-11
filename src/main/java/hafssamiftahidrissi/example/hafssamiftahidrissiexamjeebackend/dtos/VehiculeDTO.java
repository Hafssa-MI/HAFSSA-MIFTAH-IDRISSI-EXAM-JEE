package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.StatutVehicule;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.TypeCarburant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehiculeDTO {

    private Long id;
    private String marque;
    private String modele;
    private double prixParJour;
    private int annee;
    private TypeCarburant typeCarburant;
    private StatutVehicule statutVehicule;
    private Long agenceId;
}
