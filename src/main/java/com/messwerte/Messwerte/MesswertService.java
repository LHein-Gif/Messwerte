package com.messwerte.Messwerte;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MesswertService {

    private List<Messwert> messwertList;

    public MesswertService(){
        messwertList = new ArrayList<>();
        Messwert beamNG = new Messwert(45, 5400, 170, 13.00, 90.00, 1.2, 7.8, 1.2, "162563526353635", "beamng");
        messwertList.addAll((Arrays.asList(beamNG)));
    }

    public Optional<Messwert> getMesswert(String name) {
        Optional optional = Optional.empty();
        for(Messwert messwert : messwertList){
            if(name.equals(messwert.getName())){
                optional = Optional.of(messwert);
                return optional;
            }
        }
        return optional;
    }
}
