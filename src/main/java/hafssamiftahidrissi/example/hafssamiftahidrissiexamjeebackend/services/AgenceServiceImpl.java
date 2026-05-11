package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.AgenceDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.entities.Agence;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.mappers.AgenceMapperImpl;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.repositories.AgenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements AgenceService {

    private final AgenceRepository agenceRepository;
    private final AgenceMapperImpl agenceMapper;

    @Override
    public AgenceDTO saveAgence(AgenceDTO dto) {
        Agence agence = agenceMapper.fromAgenceDTO(dto);
        Agence savedAgence = agenceRepository.save(agence);
        return agenceMapper.fromAgence(savedAgence);
    }

    @Override
    public AgenceDTO getAgence(Long id) {
        Agence agence = agenceRepository.findById(id).orElseThrow();
        return agenceMapper.fromAgence(agence);
    }

    @Override
    public List<AgenceDTO> getAllAgences() {
        return agenceRepository.findAll()
                .stream()
                .map(agenceMapper::fromAgence)
                .toList();
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }
}
