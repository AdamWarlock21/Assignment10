package service.demography.impl;

import domain.demography.Race;
import factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.demography.RaceService;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);

        Race inRepo = service.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);

        Race inRepo = service.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);
        Race inRepo = service.read(employee.getRaceID());

        employee.setDesc("Ismail");

        service.update(employee);

        Assert.assertEquals(employee.getRaceID(), inRepo.getRaceID());

    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);

        Race inRepo = service.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getRaceID());

        Race deleted = service.read(employee.getRaceID());

        Assert.assertNull(deleted);

    }
}