package hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.web;


import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.dtos.LocationDTO;
import hafssamiftahidrissi.example.hafssamiftahidrissiexamjeebackend.services.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
@RequiredArgsConstructor
@CrossOrigin("*")
public class LocationRestController {

    private final LocationService locationService;

    @GetMapping
    public List<LocationDTO> locations() {

        return locationService.getAllLocations();
    }

    @GetMapping("/{id}")
    public LocationDTO getLocation(@PathVariable Long id) {

        return locationService.getLocation(id);
    }

    @PostMapping
    public LocationDTO saveLocation(@RequestBody LocationDTO dto) {

        return locationService.saveLocation(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable Long id) {

        locationService.deleteLocation(id);
    }
}
