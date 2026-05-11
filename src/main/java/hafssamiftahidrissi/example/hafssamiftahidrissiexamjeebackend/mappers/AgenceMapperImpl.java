package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.mappers;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.AgenceDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Agence;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AgenceMapperImpl {

    public AgenceDTO fromAgence(Agence agence) {
        AgenceDTO dto = new AgenceDTO();
        BeanUtils.copyProperties(agence, dto);
        return dto;
    }

    public Agence fromAgenceDTO(AgenceDTO dto) {
        Agence agence = new Agence();
        BeanUtils.copyProperties(dto, agence);
        return agence;
    }
}
