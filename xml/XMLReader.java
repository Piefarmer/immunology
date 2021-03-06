package piefarmer.immunology.xml;
import org.xml.sax.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class XMLReader {
	
	public static String getDescriptionByDiseaseID(String id){
		
		Document xmlDoc = getDocument("./assets/immunology/diseases.xml");	
		NodeList listofdiseases = xmlDoc.getElementsByTagName("disease");		
		return getDiseaseElement(listofdiseases, id);
	}

	private static String getDiseaseElement(NodeList listofdiseases, String id) {
		
		try{
			
			for(int i = 0; i < listofdiseases.getLength(); i++)
			{
				Node diseaseNode = listofdiseases.item(i);
				
				Element diseaseElement = (Element)diseaseNode;
				
						
				NodeList idList = diseaseElement.getElementsByTagName("diseaseid");
				
				Element idElement = (Element)idList.item(0);
				
				NodeList elementList = idElement.getChildNodes();
				
				if(((Node)elementList.item(0)).getNodeValue().trim().equals(id))
				{
					NodeList desList = diseaseElement.getElementsByTagName("description");
					
					Element desElement = (Element)desList.item(0);
					
					elementList = desElement.getChildNodes();
					return ((Node)elementList.item(0)).getNodeValue().trim();
				}
								
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Not researched disease.";
		
	}
	public static String getDescriptionByDiseaseEffectID(String id){
		
		Document xmlDoc = getDocument("./assets/immunology/diseases.xml");	
		NodeList listofdiseases = xmlDoc.getElementsByTagName("diseaseeffect");		
		return getDiseaseEffectElement(listofdiseases, id);
	}

	private static String getDiseaseEffectElement(NodeList listofdiseases, String id) {
		
		try{
			
			for(int i = 0; i < listofdiseases.getLength(); i++)
			{
				Node diseaseNode = listofdiseases.item(i);
				
				Element diseaseElement = (Element)diseaseNode;
				
						
				NodeList idList = diseaseElement.getElementsByTagName("diseaseeffectid");
				
				Element idElement = (Element)idList.item(0);
				
				NodeList elementList = idElement.getChildNodes();
				
				if(((Node)elementList.item(0)).getNodeValue().trim().equals(id))
				{
					NodeList desList = diseaseElement.getElementsByTagName("description");
					
					Element desElement = (Element)desList.item(0);
					
					elementList = desElement.getChildNodes();
					return ((Node)elementList.item(0)).getNodeValue().trim();
				}
								
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Not researched side effect.";
		
	}

	private static Document getDocument(String string) {
		try{
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setIgnoringComments(true);
			factory.setIgnoringElementContentWhitespace(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			return builder.parse(new InputSource(string));
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;

	}

}
