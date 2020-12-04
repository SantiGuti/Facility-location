package logic.data;

public class ManejoDeArchivos {
	
	public static void main(String[] args) {
		
		ListDistributionCenter centers= new ListDistributionCenter();
		centers.addDistributionCenter("Local1", -34.5222325,-58.7009527);
		centers.addDistributionCenter("Local2", -34.525685, -58.736136);
		centers.addDistributionCenter("Local3", -34.551848, -58.690279);
		centers.addDistributionCenter("Local4", -34.504476, -58.659699);
		centers.addDistributionCenter("Local5", -34.474245, -58.655236);
		centers.addDistributionCenter("Local6", -34.473460, -58.681386);
		centers.addDistributionCenter("Local7", -34.592245, -58.623833);
		
		String jsonCenter= centers.generateJSONPretty();
		
		centers.saveJSON(jsonCenter, "ListDistributionCenters.JSON");
		
		ListCustomer customers= new ListCustomer();
		customers.addCustomer(-34.520514, -58.679575);
		customers.addCustomer(-34.526697, -58.706885);
		customers.addCustomer(-34.539007, -58.700938);
		customers.addCustomer(-34.518220, -58.710681);
		customers.addCustomer(-34.511366, -58.688722);
		customers.addCustomer(-34.518164, -58.659785);
		customers.addCustomer(-34.555415, -58.733772);
		customers.addCustomer(-34.515648, -58.760000);
		customers.addCustomer(-34.558363, -58.691645); 
		customers.addCustomer(-34.503010, -58.633109);
		
		String jsonCustomer= customers.generateJSONPretty();
		
		customers.saveJSON(jsonCustomer, "ListCustomer.JSON");
			
		
	}

}
