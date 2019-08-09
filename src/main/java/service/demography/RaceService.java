package service.demography;

import domain.demography.Race;
import service.Service;

import java.util.Set;

public interface RaceService extends Service<Race, Integer> {

    Set<Race> getAll();

}
