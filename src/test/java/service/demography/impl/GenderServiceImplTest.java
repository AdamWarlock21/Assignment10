package service.demography.impl;

import domain.demography.Gender;
import factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.demography.GenderService;

import java.util.Set;

public class GenderServiceImplTest {

    private GenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Gender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);
        Gender inRepo = service.read(employee.getId());

        employee.setDesc("Ismail");

        service.update(employee);

        Assert.assertEquals(employee.getId(), inRepo.getId());

    }

    @Test
    public void delete() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getId());

        Gender deleted = service.read(employee.getId());

        Assert.assertNull(deleted);

    }
}