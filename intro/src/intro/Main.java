package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//DRY
		String internetSubeButonu="�nternet �ubeye gir";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun)
		{
			System.out.println("dolar d��t� resmi");
		}else if(dolarBugun>dolarDun)
		{
			System.out.println("Dolar y�kseldi resmi");
		}
		else
		{
			System.out.println("Dolar e�ittir resmi");
		}
		
		String kredi1="H�zl� Kredi";
		String kredi2="Mutlu emekli kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="�ift�i Kredisi";
		String kredi5="Msb Kredisi";
		
		
		String[] krediler= {
				"H�zl� Kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"�ift�i Kredisi",
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
