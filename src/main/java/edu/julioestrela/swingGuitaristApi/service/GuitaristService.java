package edu.julioestrela.swingGuitaristApi.service;

import edu.julioestrela.swingGuitaristApi.model.Guitarist;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GuitaristService {
    private static Set<Guitarist> guitarists;

    // static initializer happens before every constructor in its class
    static {
        guitarists = new HashSet<>(List.of(new Guitarist("Eric", "Clapton"), new Guitarist("Jimi", "Hendrix")));
    }

    public Guitarist addGuitarist(String name, String lastName) {
        Guitarist newGuitarist = new Guitarist(name, lastName);
        guitarists.add(newGuitarist);
        return newGuitarist;
    }

    public Guitarist findByLastName(String lastName) {
        // Using Optional with Stream
        return guitarists.stream()
                .filter(guitarist -> guitarist.lastName().equals(lastName))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Guitarist not Found"));
    }

    public Set<Guitarist> listGuitarists() {
        return guitarists;
    }
}
