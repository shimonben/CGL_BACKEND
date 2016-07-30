package GeneticAlgorithm;

import java.util.HashMap;

public class Coil extends DNA{
	public static String STEEL_THICKNESS = "Steel Thickness";
	public static String STEEL_WIDTH = "Steel Width";
	public static String STEEL_GRADE = "Steel Grde";
	public static String ZINC_LAYER = "Zinc Layer";
	private HashMap<String,Float> m_mpCoilProperties;
	
	
	public Coil() {
		m_mpCoilProperties = new HashMap<String,Float>();
	}
	
	public void setProperty(String sName, float fValue){
		m_mpCoilProperties.put(sName,fValue);
	}
	
	public float getPropery(String sName){
		return m_mpCoilProperties.get(sName);
	}
	
	
}
