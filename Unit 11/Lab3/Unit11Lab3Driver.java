package Lab3;
public class Unit11Lab3Driver {
	public static void main(String[] args) {
		APBiology APBIO = new APBiology("MRHS");
		APCalculus APC = new APCalculus("MRHS");
		APUSH APUH = new APUSH("MRHS");
		APLC APLit = new APLC("MRHS");
		APCOMSCI APCOMPSCI = new APCOMSCI("MRHS");
		
		HonorsChemistry CH = new HonorsChemistry("MRHS", 1);
		HonorsMath MH = new HonorsMath("MRHS", 3);
		HonorsCivics CIH = new HonorsCivics("MRHS");
		HonorsAI AIH = new HonorsAI("MRHS");
		HonorsRobotics RH = new HonorsRobotics("MRHS", 1);
		
		System.out.println(APBIO.classwork());
		System.out.println(APC.classwork());
		System.out.println(APUH.classwork());
		System.out.println(APLit.classwork());
		System.out.println(APCOMPSCI.classwork());
		
		System.out.println();
	
		System.out.println(CH.classwork());
		System.out.println(MH.classwork());
		System.out.println(CIH.classwork());
		System.out.println(AIH.classwork());
		System.out.println(RH.classwork());
		
		System.out.println();
		
		System.out.println(APBIO);
		System.out.println();

		System.out.println(APC);
		System.out.println();

		System.out.println(APUH);
		System.out.println();

		System.out.println(APLit);
		System.out.println();

		System.out.println(APCOMPSCI);
		System.out.println();

		System.out.println(CH);
		System.out.println();

		System.out.println(MH);
		System.out.println();

		System.out.println(CIH);
		System.out.println();

		System.out.println(AIH);
		System.out.println();
		
		System.out.println(RH);
		System.out.println();
	}
}
