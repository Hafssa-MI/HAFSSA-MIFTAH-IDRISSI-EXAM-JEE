package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.web;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.VehiculeDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services.VehiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@RequiredArgsConstructor
@CrossOrigin("*")
public class VehiculeRestAPI {

    private final VehiculeService vehiculeService;

    @GetMapping
    public List<VehiculeDTO> vehicules() {

        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{id}")
    public VehiculeDTO getVehicule(@PathVariable Long id) {

        return vehiculeService.getVehicule(id);
    }

    @PostMapping
    public VehiculeDTO saveVehicule(@RequestBody VehiculeDTO dto) {

        return vehiculeService.saveVehicule(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id) {

        vehiculeService.deleteVehicule(id);
    }
}
