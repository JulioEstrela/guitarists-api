package edu.julioestrela.swingGuitaristApi.controller;

import edu.julioestrela.swingGuitaristApi.model.Guitarist;
import edu.julioestrela.swingGuitaristApi.service.GuitaristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping("guitarists")
@RestController
public class GuitaristController {
    private final GuitaristService guitaristService;

    public GuitaristController(GuitaristService guitaristService) {
        this.guitaristService = guitaristService;
    }

    @GetMapping
    public ResponseEntity<Set<Guitarist>> showGuitarists() {
        return ResponseEntity.ok(guitaristService.listGuitarists());
    }

    @GetMapping(path = "/{lastName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Guitarist> getGuitaristByLastName(@PathVariable String lastName) {
        return ResponseEntity.ok(guitaristService.findByLastName(lastName));
    }

    @PostMapping
    public ResponseEntity<Guitarist> addGuitarist(@RequestParam("name") String name, @RequestParam("lastName") String lastName) {
        return new ResponseEntity<>(guitaristService.addGuitarist(name, lastName), HttpStatus.CREATED);
    }
}
