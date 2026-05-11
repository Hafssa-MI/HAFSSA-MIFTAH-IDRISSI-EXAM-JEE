package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomClient;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private double montantTotal;

    @ManyToOne
    private Vehicule vehicule;

    @ManyToOne
    private Agence agence;
}
