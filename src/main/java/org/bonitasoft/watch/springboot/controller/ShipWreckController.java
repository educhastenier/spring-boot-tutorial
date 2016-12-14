package org.bonitasoft.watch.springboot.controller;

import java.util.List;

import org.bonitasoft.watch.springboot.model.Shipwreck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emmanuel Duchastenier
 */
@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {

    }
}
