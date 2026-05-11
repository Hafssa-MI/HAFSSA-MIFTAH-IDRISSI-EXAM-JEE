package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.VehiculeDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Agence;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Vehicule;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.mappers.VehiculeMapperImpl;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.AgenceRepository;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.VehiculeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements VehiculeService {

    private final VehiculeRepository vehiculeRepository;
    private final AgenceRepository agenceRepository;
    private final VehiculeMapperImpl vehiculeMapper;

    @Override
    public VehiculeDTO saveVehicule(VehiculeDTO dto) {

        Agence agence = agenceRepository.findById(dto.getAgenceId()).orElseThrow();

        Vehicule vehicule = new Vehicule() {
        };

        vehicule.setMarque(dto.getMarque());
        vehicule.setModele(dto.getModele());
        vehicule.setPrixParJour(dto.getPrixParJour());
        vehicule.setAnnee(dto.getAnnee());
        vehicule.setTypeCarburant(dto.getTypeCarburant());
        vehicule.setStatutVehicule(dto.getStatutVehicule());
        vehicule.setAgence(agence);

        Vehicule savedVehicule = vehiculeRepository.save(vehicule);

        return vehiculeMapper.fromVehicule(savedVehicule);
    }

    @Override
    public VehiculeDTO getVehicule(Long id) {

        Vehicule vehicule = vehiculeRepository.findById(id).orElseThrow();

        return vehiculeMapper.fromVehicule(vehicule);
    }

    @Override
    public List<VehiculeDTO> getAllVehicules() {

        return vehiculeRepository.findAll()
                .stream()
                .map(vehiculeMapper::fromVehicule)
                .toList();
    }

    @Override
    public void deleteVehicule(Long id) {

        vehiculeRepository.deleteById(id);
    }
}