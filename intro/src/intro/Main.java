package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//DRY
		String internetSubeButonu="Ýnternet Þubeye gir";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun)
		{
			System.out.println("dolar düþtü resmi");
		}else if(dolarBugun>dolarDun)
		{
			System.out.println("Dolar yükseldi resmi");
		}
		else
		{
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1="Hýzlý Kredi";
		String kredi2="Mutlu emekli kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="Çiftçi Kredisi";
		String kredi5="Msb Kredisi";
		
		
		String[] krediler= {
				"Hýzlý Kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
		};
		
		//foreach
		for(String kredi:krediler)
		{
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++)
		{
			System.out.println(krediler[i]);
		}
	}
	

}
