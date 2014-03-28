package org.upv.ufasu.weather.test;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.upv.ufasu.weather.TemperatureConversor;

public class TemperatureConversorTest extends TestCase {
	
	Logger log = Logger.getLogger(TemperatureConversorTest.class);
	
	public void testConversor() {
		//float tempF=50;	//Temperatura en F
		String tempF="50";
		log.info("Empezamos el test de conversión");
		TemperatureConversor conversor = new TemperatureConversor();		
		String tempC=conversor.getTempFar2Cel(tempF);		
		assertEquals("10",tempC );
		log.info("Resultado para: "+tempF+ " grados Farenheit es "+tempC);
		log.info("Fin del test");		
	}
}
