package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.BoiteVitesse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class VoitureDTO extends VehiculeDTO {

    private int nombrePortes;
    private BoiteVitesse boiteVitesse;
    private boolean climatisation;
}
