package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services;

import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.AgenceDTO;

import java.util.List;

public interface AgenceService {

    AgenceDTO saveAgence(AgenceDTO dto);

    AgenceDTO getAgence(Long id);

    List<AgenceDTO> getAllAgences();

    void deleteAgence(Long id);
}
