package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.VehiculeDTO;

import java.util.List;

public interface VehiculeService {

    VehiculeDTO saveVehicule(VehiculeDTO dto);

    VehiculeDTO getVehicule(Long id);

    List<VehiculeDTO> getAllVehicules();

    void deleteVehicule(Long id);
}
