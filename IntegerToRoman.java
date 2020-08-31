import java.util.*;
public class RomanToInteger {
	
	public String getRomanValue(String x) {
		String str[] = new String[12];
		str[0] = x.replaceAll("IIIII", "V");
		str[1] = str[0].replaceAll("IIII", "IV");
		str[2] = str[1].replaceAll("VV", "X");
		str[3] = str[2].replaceAll("VIV", "IX");
		str[4] = str[3].replaceAll("XXXXX", "L");
		str[5] = str[4].replaceAll("XXXX", "XL");
		str[6] = str[5].replaceAll("LL", "C");
		str[7] = str[6].replaceAll("LXL", "XC");
		str[8] = str[7].replaceAll("CCCCC", "D");
		str[9] = str[8].replaceAll("CCCC", "CD");
		str[10] = str[9].replaceAll("DD", "M");
		str[11] = str[10].replaceAll("DCD", "CM");
		
		return str[11];
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		RomanToInteger obj = new RomanToInteger();
		String Temp = "";
		System.out.print("Enter The Number : ");
		int Num = in.nextInt();
		for(int i = 1 ; i <= Num ; i++) {
			Temp = Temp + "I";
		}
		
		String Roman = obj.getRomanValue(Temp);
		
		System.out.print("The Roman Value Of "+Num+" is "+Roman);
	}

}
