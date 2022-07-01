import java.util.*;
public class DisplayAdjacentCountryNames {

	public static void main(String[] args) {
		
		Boolean status = false;
		
		// Here i created one map object
		Map<String, String> neighbouringCountries = new HashMap<String, String>();
		
		
		//Here i am adding country names to map object
		neighbouringCountries.put("IN", "Bangladesh | Bhutan | China | Myanmar | Nepal | Pakistan ");
		neighbouringCountries.put("AFG", "China | Iran | Pakistan | Tajikistan | Turkmenistan | Uzbekistan ");
		neighbouringCountries.put("AGO", "Democratic Republic of the Congo | Republic of Congo | Namibia | Zambia ");
		neighbouringCountries.put("ALB", "Greece | Kosovo | Macedonia | Montenegro ");
		neighbouringCountries.put("ARE", "Oman | Saudi Arabia ");
		neighbouringCountries.put("ARG", "Bolivia | Brazil | Chile | Paraguay | Uruguay ");
		neighbouringCountries.put("ARM", "Azerbaijan | Georgia | Iran | Turkey ");
		neighbouringCountries.put("AZE", "Armenia | Georgia | Iran | Russia | Turkey  ");
		neighbouringCountries.put("BDI", "Democratic Republic of the Congo | Rwanda | United Republic of Tanzania  ");
		neighbouringCountries.put("BEL", "Germany | France | Luxembourg | Netherlands  ");
		neighbouringCountries.put("BEN", "Burkina Faso | Niger | Nigeria | Togo  ");
		neighbouringCountries.put("BFA", "Benin | Ivory Coast | Ghana | Mali | Niger | Togo ");
		neighbouringCountries.put("BGR", "Greece | Macedonia | Republic of Serbia | Turkey  ");
		neighbouringCountries.put("BIH", "Croatia | Montenegro | Republic of Serbia  ");
		neighbouringCountries.put("BLR", "Lithuania | Latvia | Poland | Russia | Ukraine  ");
		neighbouringCountries.put("BLZ", "Guatemala | Mexico  ");
		neighbouringCountries.put("BOL", "Argentina | Brazil | Chile | Peru | Paraguay  ");
		neighbouringCountries.put("BRA", "Argentina | Bolivia | Colombia | France | Guyana | Peru | Paraguay| Suriname | Uruguay | Venezuela  ");
		neighbouringCountries.put("BRN", "Malaysia   ");
		neighbouringCountries.put("BTN", "China | India   ");
		neighbouringCountries.put("BWA", "Namibia | South Africa | Zambia | Zimbabwe   ");
		neighbouringCountries.put("CAF", "Cameroon |  Democratic Republic of the Congo | Republic of Congo | Sudan | Chad   ");
		neighbouringCountries.put("CAN", "United States of America  ");
		neighbouringCountries.put("CHE", "Austria | Germany | France | Italy |   ");
		neighbouringCountries.put("CHL", "Argentina | Bolivia | Peru ");
		neighbouringCountries.put("CHN", "Afghanistan | Bhutan | India | Kazakhstan | Kyrgyzstan | Laos | Myanmar | Mongolia | Nepal | Pakistan | North Korea |Russia |Tajikistan | Vietnam ");
		neighbouringCountries.put("CIV", "Burkina Faso | Ghana | Guinea | Liberia | Mali ");
		neighbouringCountries.put("CMR", "Central African Republic | Republic of Congo | Gabon | Equatorial Guinea | Niger | Nigeria | Chad ");
		neighbouringCountries.put("COD", "Angola | Burundi | Central African Republic | Republic of Congo | Rwanda | South Sudan | United Republic of Tanzania | Uganda | Zambia ");
		neighbouringCountries.put("COG", "Angola | Central African Republic | Cameroon | Democratic Republic of the Congo | Gabon ");
		neighbouringCountries.put("COL", "Brazil | Peru | Ecuador | Venezuela | Panama ");
		neighbouringCountries.put("CRI", "Nicaragua | Panama  ");
		neighbouringCountries.put("CYN", "Cyprus  ");
		neighbouringCountries.put("CYP", "Northern Cyprus  ");
		neighbouringCountries.put("CZE", "Austria | Germany | Poland | Slovakia  ");
		neighbouringCountries.put("DEU", "Austria | Belgium | Switzerland | Czech Republic |Denmark | France | Luxembourg | Netherlands | Poland  ");
		neighbouringCountries.put("DJI", "Eritrea | Ethiopia | Somaliland ");
		neighbouringCountries.put("DNK", "Germany ");
		neighbouringCountries.put("DOM", "Haiti ");
		neighbouringCountries.put("DZA", "Libya | Morocco | Mali | Mauritania | Niger | Western Sahara | Tunisia ");
		neighbouringCountries.put("ECU", "Colombia | Peru ");
		neighbouringCountries.put("EGY", "Israel | Libya | Sudan ");
		neighbouringCountries.put("ERI", "Djibouti | Ethiopia | Sudan ");
		neighbouringCountries.put("ESP", "France | Portugal ");
		neighbouringCountries.put("EST", "Latvia | Russia ");
		neighbouringCountries.put("ETH", "Djibouti | Eritrea | Kenya | Sudan | South Sudan | Somaliland | Somalia ");
		neighbouringCountries.put("FIN", "Norway | Russia | Sweden ");
		neighbouringCountries.put("FRA", "Belgium | Brazil | Switzerland | Germany | Spain | Italy | Luxembourg | Suriname ");
		neighbouringCountries.put("GAB", "Cameroon | Republic of Congo | Equatorial Guinea ");
		neighbouringCountries.put("GBR", "Ireland  ");
		neighbouringCountries.put("GEO", "Armenia |Azerbaijan | Russia | Turkey  ");
		neighbouringCountries.put("GHA", "Burkina Faso |Ivory Coast | Togo ");
		neighbouringCountries.put("GIN", "Ivory Coast |Guinea Bissau | Liberia | Mali | Senegal | Sierra Leone ");
		neighbouringCountries.put("GMB", "Senegal ");
		neighbouringCountries.put("GNB	", "Guinea | Senegal  ");
		neighbouringCountries.put("GNQ	", "Cameroon | Gabon  ");
		neighbouringCountries.put("GRC	", "Albania | Bulgaria | Macedonia | Turkey  ");
		neighbouringCountries.put("GTM	", "Belize | Honduras | Mexico | El Salvador  ");
		neighbouringCountries.put("GUY	", "Brazil | Suriname | Venezuela  ");
		neighbouringCountries.put("HND	", "Guatemala | Nicaragua | El Salvador  ");
		neighbouringCountries.put("HRV	", "Hungary | Bosnia and Herzegovina | Montenegro | Republic of Serbia | Slovenia  ");
		neighbouringCountries.put("HTI	", "Dominican Republic ");
		neighbouringCountries.put("HUN	", "Austria | Croatia | Romania | Republic of Serbia | Slovakia | Slovenia | Ukraine ");
		neighbouringCountries.put("IDN	", "Malaysia | Papua New Guinea | East Timor ");
		neighbouringCountries.put("IRL	", "United Kingdom ");
		neighbouringCountries.put("IRN	", "Afghanistan | Armenia | Azerbaijan | Iraq | Pakistan | Turkmenistan | Turkey ");
		neighbouringCountries.put("IRQ	", "Iran | Jordan | Kuwait | Saudi Arabia | Syria | Turkey ");
		neighbouringCountries.put("ISR	", "Egypt | Jordan | Lebanon | Palestine | Syria ");
		neighbouringCountries.put("ITA	", "Austria | Switzerland | France | Slovenia ");
		neighbouringCountries.put("JOR	", "Iraq | Israel | Palestine | Saudi Arabia | Syria ");
		neighbouringCountries.put("KAZ	", "China | Kyrgyzstan | Russia |Turkmenistan | Uzbekistan ");
		neighbouringCountries.put("KEN	", "Ethiopia | South Sudan | Somalia |United Republic of Tanzania | Uganda ");
		neighbouringCountries.put("KGZ	", "China | Kazakhstan | Tajikistan |Uzbekistan ");
		neighbouringCountries.put("KHM	", "Laos | Thailand | Vietnam ");
		neighbouringCountries.put("KOR	", "North Korea  ");
		neighbouringCountries.put("KOS	", "Albania | Macedonia | Montenegro | Republic of Serbia");
		neighbouringCountries.put("KWT	", "Iraq | Saudi Arabia ");
		neighbouringCountries.put("LAO	", "China | Cambodia | Myanmar | Thailand | Vietnam ");
		neighbouringCountries.put("LBN	", "Israel | Syria ");
		neighbouringCountries.put("LBR	", "Ivory Coast | Guinea |Sierra Leone ");
		neighbouringCountries.put("LBY	", "Algeria | Egypt |Niger | Sudan| Chad| Tunisia ");
		neighbouringCountries.put("LSO	", "South Africa ");
		neighbouringCountries.put("LTU	", "Belarus | Latvia | Poland | Russia ");
		neighbouringCountries.put("LUX	", "Belgium | Germany | France ");
		neighbouringCountries.put("LVA	", "Belarus | Estonia | Lithuania | Russia ");
		neighbouringCountries.put("MAR	", "Algeria | Western Sahara ");
		neighbouringCountries.put("MDA	", "Romania | Ukraine ");
		neighbouringCountries.put("MEX	", "Belize | Guatemala | United States of America ");
		neighbouringCountries.put("MKD	", "Albania | Bulgaria | Greece | Kosovo | Republic of Serbia ");
		neighbouringCountries.put("MLI	", "Burkina Faso | Ivory Coast | Algeria | Guinea | Mauritania | Niger | Senegal ");
		neighbouringCountries.put("MMR	", "Bangladesh | China | India | Laos | Thailand ");
		neighbouringCountries.put("MNE	", "Albania | Bosnia and Herzegovina | Croatia | Kosovo | Republic of Serbia ");
		neighbouringCountries.put("MNG	", "China | Russia ");
		neighbouringCountries.put("MOZ	", "Malawi | Swaziland | United Republic of Tanzania | South Africa | Zambia | Zimbabwe ");
		neighbouringCountries.put("MRT	", "Algeria | Mali | Western Sahara | Senegal ");
		neighbouringCountries.put("MWI	", "Mozambique | United Republic of Tanzania | Zambia ");
		neighbouringCountries.put("MYS	", "Brunei | Indonesia | Thailand ");
		neighbouringCountries.put("NAM	", "Angola | Botswana | South Africa | Zambia ");
		neighbouringCountries.put("NER	", "Benin | Burkina Faso | Cameroon | Algeria | Libya | Mali | Nigeria | Chad ");
		neighbouringCountries.put("NGA	", "Benin | Cameroon | Niger ");
		neighbouringCountries.put("NIC	", "Costa Rica | Honduras  ");
		neighbouringCountries.put("NLD	", "Germany | Belgium  ");
		neighbouringCountries.put("NOR	", "Finland | Russia | Sweden  ");
		neighbouringCountries.put("NPL	", "China | India ");
		neighbouringCountries.put("OMN	", "United Arab Emirates | Saudi Arabia | Yemen ");
		neighbouringCountries.put("PAK	", "Afghanistan | China | India | Iran ");
		neighbouringCountries.put("PAN	", "Colombia | Costa Rica ");
		neighbouringCountries.put("PER	", "Bolivia | Brazil | Chile | Colombia | Ecuador ");
		neighbouringCountries.put("PNG	", "Indonesia" );
		neighbouringCountries.put("POL	", "Belarus | Czech Republic | Germany | Lithuania | Russia | Slovakia | Ukraine" );
		
		System.out.println("Enter the country code");
		Scanner userInput = new Scanner(System.in);
		String countryName= userInput.nextLine();
		
		
		
		//Here we using for loop for iterating country names
		for(Map.Entry<String, String> iteratedCountryName : neighbouringCountries.entrySet()){
			if(iteratedCountryName.getKey().equals(countryName)) {
				System.out.println(iteratedCountryName.getValue());
				status = true;
				break;
			}
			else {
				status = false;
			     }
			
		}
		if(status==false) {
			System.out.println("Invalid Code");
		}
		userInput.close();
	}

}
