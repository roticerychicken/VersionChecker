package com.versioncheck.jsp;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CalculateVersion {
	public static String getVersion(String vn) {

		if(vn != null ) {
			String re = "[0-9][0-9.]*";
			
			Pattern p = Pattern.compile(re);
			Matcher mt = p.matcher(vn);

			if(mt.matches()) {
				if(mt.groupCount() > 0) {
					return "";
				} else {
					return mt.group(0);
				}
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

	public static String calculate(String v1, String v2) {
		
		
		if(v1.length() > 0 && v2.length() > 0) {
			
			String[] r1 = v1.split("\\.");
			String[] r2 = v2.split("\\.");
			
			int counter = 0;
			
			int max = (r1.length > r2.length) ? r1.length : r2.length;
			int min = (r1.length < r2.length) ? r1.length : r2.length;
			
			while(counter < max) {
				if(counter < min) {
					if(Integer.parseInt(r1[counter]) == Integer.parseInt(r2[counter])) {
						counter++;
					} else {
						if(Integer.parseInt(r1[counter]) > Integer.parseInt(r2[counter])) {
							return " is after ";
						} else {
							return " is before ";
						}
					}
				} else {
					if(max == r1.length) {
						if(Integer.parseInt(r1[counter]) == 0) {
							counter++;
						} else {
							return " is after ";
						}
					} else {
						if(Integer.parseInt(r2[counter]) == 0) {
							counter++;
						} else {
							return " is before ";
						}
					}
				}
			}
		} else {
			return " Invalid Input ";
		}
		
		return " is equal to ";
	}
}
