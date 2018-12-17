package com.springboot.controller;

import com.springboot.model.Shipwreck;
import com.springboot.repository.ShipwreckRepository;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class DummyControllerTest {

    @InjectMocks
    private DummyController dummyController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @BeforeClass
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddShipwreck(){
        Shipwreck shipwreck = new Shipwreck("name","address");
        when(shipwreckRepository.saveAndFlush(any(Shipwreck.class))).thenReturn(shipwreck);
        Shipwreck s1 = dummyController.addShipWreck(shipwreck);
        Assert.assertEquals(s1.getName(),"name");
    }
}
