package org.bonitasoft.watch.springboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.bonitasoft.watch.springboot.controller.HomeController;
import org.junit.Test;

/**
 * @author Emmanuel Duchastenier
 */
public class AppTest {

    @Test
    public void homeController_should_return_proper_DasBoot_result() throws Exception {
        HomeController homeController = new HomeController();
        final String result = homeController.home();
        assertThat(result).isEqualTo("Das Boot, reporting for duty!");
    }
}
