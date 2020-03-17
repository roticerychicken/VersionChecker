package com.versioncheck.jsp;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CalculateVersion {
	
	public static String getVersion(String version_number) {
		if(version_number != null ) {
			String regular_exp = "^(0|[1-9][0-9]*)(((\\.)(0|[1-9][0-9]*))?)*$";
			
			Pattern ptn = Pattern.compile(regular_exp);
			Matcher match = ptn.matcher(version_number);

			if(match.matches() == true) {
				return version_number;
			}
		} 
		return "";
		
	}

	public static String calculate(String v1, String v2) {
		
		//if 
		if(v1.length() > 0 && v2.length() > 0) {
			
			String[] version1_nums = v1.split("\\.");
			String[] version2_nums = v2.split("\\.");
			
			int shorter_lst_length,longer_lst_length,counter = 0;
			
			if(version2_nums.length > version1_nums.length) {
				longer_lst_length = version2_nums.length;
				shorter_lst_length = version1_nums.length;
			} else if(version2_nums.length < version1_nums.length){
				longer_lst_length = version1_nums.length;
				shorter_lst_length = version2_nums.length;
			} else {
				longer_lst_length = version1_nums.length;
				shorter_lst_length = version2_nums.length;
			}
			
			
			while(counter < longer_lst_length) {
				if(counter < shorter_lst_length) {
					if(Integer.parseInt(version1_nums[counter]) == Integer.parseInt(version2_nums[counter])) {
						counter++;
					} else {
						if(Integer.parseInt(version1_nums[counter]) > Integer.parseInt(version2_nums[counter])) {
							return v1 + " is after " + v2;
						} else {
							return v1 + " is before " + v2;
						}
					}
				} else {
					if(longer_lst_length == version1_nums.length) {
						if(Integer.parseInt(version1_nums[counter]) == 0) {
							counter++;
						} else {
							return v1 + " is after " + v2;
						}
					} else {
						if(Integer.parseInt(version2_nums[counter]) == 0) {
							counter++;
						} else {
							return v1 + " is before " + v2;
						}
					}
				}
			}
			return v1 + " is equal to " + v2;
		} 
		return " Invalid Input ";
	}
}
