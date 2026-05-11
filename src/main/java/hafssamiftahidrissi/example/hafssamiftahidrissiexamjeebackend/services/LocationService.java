package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.LocationDTO;

import java.util.List;

public interface LocationService {

    LocationDTO saveLocation(LocationDTO dto);

    LocationDTO getLocation(Long id);

    List<LocationDTO> getAllLocations();

    void deleteLocation(Long id);
}
