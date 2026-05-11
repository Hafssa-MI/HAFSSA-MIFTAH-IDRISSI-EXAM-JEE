package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDTO {

    private Long id;
    private String nomClient;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montantTotal;
    private Long vehiculeId;
    private Long agenceId;
}
