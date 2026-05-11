package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgenceDTO {

    private Long id;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
}
