package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.LocationDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Agence;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Vehicule;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.location;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.mappers.LocationMapper;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.AgenceRepository;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.VehiculeRepository;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;
    private final VehiculeRepository vehiculeRepository;
    private final AgenceRepository agenceRepository;
    private final LocationMapper locationMapper;

    @Override
    public LocationDTO saveLocation(LocationDTO dto) {

        Vehicule vehicule = vehiculeRepository.findById(dto.getVehiculeId()).orElseThrow();
        Agence agence = agenceRepository.findById(dto.getAgenceId()).orElseThrow();

        long nbJours = ChronoUnit.DAYS.between(dto.getDateDebut(), dto.getDateFin());
        double montant = nbJours * vehicule.getPrixParJour();

        location location = new location();
        location.setNomClient(dto.getNomClient());
        location.setDateDebut(dto.getDateDebut());
        location.setDateFin(dto.getDateFin());
        location.setMontantTotal(montant);
        location.setVehicule(vehicule);
        location.setAgence(agence);

        location savedLocation = locationRepository.save(location);

        return locationMapper.fromLocation(savedLocation);
    }

    @Override
    public LocationDTO getLocation(Long id) {
        location location = locationRepository.findById(id).orElseThrow();
        return locationMapper.fromLocation(location);
    }

    @Override
    public List<LocationDTO> getAllLocations() {
        return locationRepository.findAll()
                .stream()
                .map(locationMapper::fromLocation)
                .toList();
    }

    @Override
    public void deleteLocation(Long id) {
        locationRepository.deleteById(id);
    }
}
