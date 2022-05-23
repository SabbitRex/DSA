interface IdpTokenGeneratorClient {
	
	String getJwt();
}

class AwsIdpTokenGenerator implements IdpTokenGeneratorClient {

	@Override
	public String getJwt() {
		return "AWS-TOKEN";
	}
	
}

class AzureIdpTokenGenerator implements IdpTokenGeneratorClient {

	@Override
	public String getJwt() {
		return "AZURE-TOKEN";
	}
	
}

class IdpFactory {
	
	public static IdpTokenGeneratorClient getInstance(String idpName) {
		
		if (idpName.equals("AWS")) {
			
			return new AwsIdpTokenGenerator();
			
		} else {
			
			return new AzureIdpTokenGenerator();
		}
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		IdpTokenGeneratorClient client1 = IdpFactory.getInstance("AWS");
		System.out.println(client1.getJwt());
		
		IdpTokenGeneratorClient client2 = IdpFactory.getInstance("AZURE");
		System.out.println(client2.getJwt());
	}
}
