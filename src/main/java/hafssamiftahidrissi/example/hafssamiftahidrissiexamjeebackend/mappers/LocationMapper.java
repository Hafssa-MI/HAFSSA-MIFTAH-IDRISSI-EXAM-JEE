package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.mappers;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.LocationDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.location;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class LocationMapper {

    public LocationDTO fromLocation(location location) {
        LocationDTO dto = new LocationDTO();
        BeanUtils.copyProperties(location, dto);
        dto.setVehiculeId(location.getVehicule().getId());
        dto.setAgenceId(location.getAgence().getId());
        return dto;
    }
}
