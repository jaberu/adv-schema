package net.opengis.iso19112;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import static org.junit.Assert.assertNotNull;

/**
 * Created by aherr on 14.06.2016.
 */
public class ExamplesTest {

    @Test
    public void testBoundaries() throws JAXBException {
        JAXBContext jaxb = JAXBContext.newInstance("net.opengis.iso19112:net.opengis.gml.v_3_1_1:net.opengis.iso19139.gmd.v_20070417:net.opengis.wfs.v_1_1_0");
        Object jaxbObj = jaxb.createUnmarshaller().unmarshal(getClass().getResourceAsStream("/examples/boundary.xml"));
        assertNotNull(jaxbObj);
    }
}
