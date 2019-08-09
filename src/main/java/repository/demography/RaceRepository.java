package repository.demography;

import domain.demography.Race;
import repository.Repository;

import java.util.Set;

public interface RaceRepository extends Repository<Race, Integer> {

    Set<Race> getAll();

}
