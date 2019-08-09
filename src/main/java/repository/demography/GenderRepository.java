package repository.demography;

import domain.demography.Gender;
import repository.Repository;

import java.util.Set;

public interface GenderRepository extends Repository<Gender, Integer> {

    Set<Gender> getAll();

}
