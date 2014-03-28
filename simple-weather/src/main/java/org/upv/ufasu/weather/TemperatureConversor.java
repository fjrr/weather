package org.upv.ufasu.weather;

public class TemperatureConversor {

	//Método de conversión con int
	public int getTempFar2Cel(float temp){
		int res=0;
		
		res=(int) ((temp-32)/1.8);
		
		return res;
	}
	
	//Método de conversión con Strings
	public String getTempFar2Cel(String temp){
		String res="";
		
		Float tempF=Float.parseFloat(temp);
		
		Integer tempC=(int)((tempF-32)/1.8);
		res= tempC.toString();
		
		return res;
	}
}
