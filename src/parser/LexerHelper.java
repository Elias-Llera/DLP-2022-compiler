package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static boolean lexemeToBoolean(String str){
		return str.equals("true");
	}

	public static char lexemeToChar(String str) {
		switch (str.length()){
			case 3: // it is a normal char a, b, c...
				return str.charAt(1);
			case 4: // it is \n, \t...
				switch (str.charAt(2)){
					case 'n':
						return '\n';
					case't':
						return '\t';
					default:
						return (char)-1;
				}
			case 6: // the char is in ASCII format
				try {
					return (char) Integer.parseInt(str.substring(2, str.length() - 1));
				} catch (ClassCastException e){
					return (char)-1;
				}
			default:
				return (char)-1;
		}
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}
	
}
