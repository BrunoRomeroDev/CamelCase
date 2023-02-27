package Entidades;

public class ServiceCamelCase {

	private String text;

	public ServiceCamelCase() {

	}

	public ServiceCamelCase(String text) {
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static String converterCamelCase(String original) {
		String result = "";
		String convertido = "";
		
		if(PrimeiroNumero(original)) {
			return " ";
		}else {
			 convertido = convertString(original.split("[ ]"), result);
		}
		return convertido;
	}

	static String convertString(String[] separado, String result) {
		for (int j = 0; j < separado.length; j++) {
			char ch[] = separado[j].toCharArray();
			for (int i = 0; i < separado[j].length(); i++)
				if (i == 0)
					ch[i] = CaractValid(separado[j]) ? separado[j].charAt(i): Character.toUpperCase(separado[j].charAt(i));
				else
					ch[i] = CaractValid(separado[j]) ? separado[j].charAt(i): Character.toLowerCase(separado[j].charAt(i));
			result = result + String.valueOf(ch, 0, separado[j].length());
		}
		return result;
	}

	private static boolean CaractValid(String str) {
		return str != null && str.matches("[^!@#$%¨&*()_+]");
	}
	
	private static boolean PrimeiroNumero(String original) {
		String[] str = original.split("[ ]");
		boolean valid = str[0].matches("[0-9]*");
		return valid;
	}
}
