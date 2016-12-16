package org.bonitasoft.watch.springboot.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.bonitasoft.watch.springboot.model.Shipwreck;
import org.bonitasoft.watch.springboot.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Emmanuel Duchastenier
 */
@RunWith(MockitoJUnitRunner.class)
public class ShipwreckControllerTest {

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @InjectMocks
    private ShipwreckController sc;

    @Test
    public void getShipwreck_by_id_should_return_the_object() throws Exception {
        // given:
        Shipwreck shipwreck = new Shipwreck();
        shipwreck.setId(1L);
        doReturn(shipwreck).when(shipwreckRepository).findOne(1L);

        // when:
        final Shipwreck wreck = sc.get(1L);

        // then:
        verify(shipwreckRepository).findOne(1L);
        assertThat(wreck.getId()).isEqualTo(1L);
    }
}
