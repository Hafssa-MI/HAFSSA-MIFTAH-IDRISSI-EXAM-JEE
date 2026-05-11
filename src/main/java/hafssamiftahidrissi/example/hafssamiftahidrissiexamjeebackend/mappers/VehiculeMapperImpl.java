package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.mappers;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.VehiculeDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Vehicule;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class VehiculeMapperImpl {

    public VehiculeDTO fromVehicule(Vehicule vehicule) {
        VehiculeDTO dto = new VehiculeDTO();
        BeanUtils.copyProperties(vehicule, dto);
        dto.setAgenceId(vehicule.getAgence().getId());
        return dto;
    }
}
