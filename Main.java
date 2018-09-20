public class Main {

    public static void main(String[] args) {


    	double pi = 3.14;
    	double totalVolume = 0;
    	float heightArray[];
    	heightArray = new float[12];
    		heightArray[0] = 72;
    		heightArray[1] = 19;
			heightArray[2] = 50;
			heightArray[3] = 67;
			heightArray[4] = 16;
			heightArray[5] = 53;
			heightArray[6] = 69;
			heightArray[7] = 30;
			heightArray[8] = 52;
			heightArray[9] = 40;
			heightArray[10] = 31;
			heightArray[11] = 75;
		float diamArray[];
		diamArray = new float[12];
			diamArray[0] = 22;
			diamArray[1] = 18;
			diamArray[2] = 13;
			diamArray[3] = 16;
			diamArray[4] = 14;
			diamArray[5] = 23;
			diamArray[6] = 22;
			diamArray[7] = 22;
			diamArray[8] = 23;
			diamArray[9] = 16;
			diamArray[10] = 18;
			diamArray[11] = 23;

			double totalArray[];
			totalArray = new double[12];

			for (int i = 0; i < heightArray.length; i++)
				totalArray[i] = pi*(diamArray[i]/2)*(diamArray[i]/2)*heightArray[i];

			for (int i = 0; i < heightArray.length; i++)
				totalVolume = totalVolume+totalArray[i];

			int days = 28;
			double population = 37640;
			double waterUsage = 0.246;
			double waterUsageTot = population*waterUsage;

			double waterDefecit = (waterUsageTot*days)-totalVolume;
			double mustSaveCubic = (waterDefecit/population)/days;
			System.out.println("The people must save " + mustSaveCubic + " Cubic Meters of water each to not die at the end of the month");


    }
}
