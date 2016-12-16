package org.bonitasoft.watch.springboot.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.bonitasoft.watch.springboot.model.Shipwreck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Emmanuel Duchastenier
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRepositoryIT {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Test
    public void findAll_should_find_them_all() throws Exception {
        // when:
        final List<Shipwreck> shipwrecks = shipwreckRepository.findAll();

        // then:
        assertThat(shipwrecks.size()).isGreaterThanOrEqualTo(0);
    }
}
