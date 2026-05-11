package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.web;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.AgenceDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services.AgenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agences")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AgenceRestController {

    private final AgenceService agenceService;

    @GetMapping
    public List<AgenceDTO> agences() {

        return agenceService.getAllAgences();
    }

    @GetMapping("/{id}")
    public AgenceDTO getAgence(@PathVariable Long id) {

        return agenceService.getAgence(id);
    }

    @PostMapping
    public AgenceDTO saveAgence(@RequestBody AgenceDTO dto) {

        return agenceService.saveAgence(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteAgence(@PathVariable Long id) {

        agenceService.deleteAgence(id);
    }
}