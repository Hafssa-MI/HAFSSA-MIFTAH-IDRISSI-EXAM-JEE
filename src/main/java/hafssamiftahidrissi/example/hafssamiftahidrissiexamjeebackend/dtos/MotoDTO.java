package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.CasqueInclus;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.enums.TypeMoto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MotoDTO extends VehiculeDTO {

    private TypeMoto typeMoto;
    private CasqueInclus casqueInclus;
    private int cylindree;
}
