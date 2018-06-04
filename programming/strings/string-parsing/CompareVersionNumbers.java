// https://www.interviewbit.com/problems/compare-version-numbers/

public class Solution {
	public int compareVersion(String a, String b) {
	    
	    String[] ver1 = a.split("\\.");
	    String[] ver2 = b.split("\\.");
	    
	    if (ver1.length > ver2.length) {
	        for (int i = 0; i < ver2.length; i++) {
	            
	           String v1 = ver1[i].replaceFirst("^0+(?!$)", "");
	           String v2 = ver2[i].replaceFirst("^0+(?!$)", "");
	           
	           int vl1 = v1.length();
	           int vl2 = v2.length();
	           
	           if (vl1 != vl2) return vl1 > vl2 ? 1 : -1;
	           
	           int compare = v1.compareTo(v2);
	           if (compare != 0) return compare < 0 ? -1 : 1;
	        }
	        
	        for (int j = ver2.length; j < ver1.length; j++) {
	            
	           String v = ver1[j].replaceFirst("^0+(?!$)", "");
	           
	           int compare = v.compareTo("0");
	           if (compare != 0) return 1;
	        }
	        
	        
	    } else if (ver1.length < ver2.length) {
	        for (int i = 0; i < ver1.length; i++) {
	          
	           String v1 = ver1[i].replaceFirst("^0+(?!$)", "");
	           String v2 = ver2[i].replaceFirst("^0+(?!$)", "");
	           
	           
	           int vl1 = v1.length();
	           int vl2 = v2.length();
	           
	           if (vl1 != vl2) return vl1 > vl2 ? 1 : -1;
	           
	           
	           int compare = v1.compareTo(v2);
	           if (compare != 0) return compare < 0 ? -1 : 1;
	        }
	        
	        for (int j = ver1.length; j < ver2.length; j++) {
	            
	           String v = ver2[j].replaceFirst("^0+(?!$)", "");
	           
	           int compare = v.compareTo("0");
	           if (compare != 0) return -1;
	        }
	        
	    } else {
	        for (int i = 0; i < ver1.length; i++) {
	           
	           String v1 = ver1[i].replaceFirst("^0+(?!$)", "");
	           String v2 = ver2[i].replaceFirst("^0+(?!$)", "");
	           
	           
	           int vl1 = v1.length();
	           int vl2 = v2.length();
	           
	           if (vl1 != vl2) return vl1 > vl2 ? 1 : -1;
	           
	           
	           int compare = v1.compareTo(v2);
	           if (compare != 0) return compare < 0 ? -1 : 1;
	        }
	        
	    }
	    
	    
        return 0;
	}
}
