package com.gestionagricole.test.tools;

public class FilterObjects {

	
	public String getKey() {
		return String.valueOf(componentID.hashCode());
	}
	
	String key;
	String value;

	String componentID;

	
	public void setFiltre(String key1,String value2,String componentID3)
	{
		this.key=key1;
		this.value=value2;
		this.componentID=componentID3;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((componentID == null) ? 0 : componentID.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	/*
	 * TODO
	 * Dans cette logique deux Objets égaux c'est deux objets qui ont les mêmes key/value et componentID differents
	 * C'est une logique Bizare qui faux changer aprés
	 */
	@Override
	public boolean equals(Object obj) {
		
		FilterObjects other = (FilterObjects) obj;
		if(other.key.equals(this.key) && other.value.equals(value) && !other.componentID.equals(this.componentID))
			return true;
		
		return false;
	}
	
	
}
