package collection8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class ProductionFacility {
	int pliid; 
	String pro_facility_name;
	String pro_fa_location;
	int totalproduction_perday;
	String itemnames[];
	LocalDate prod_date;

	
	
	 public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}

	 


	public int getPliid() {
		return pliid;
	}




	public void setPliid(int pliid) {
		this.pliid = pliid;
	}




	public String getPro_facility_name() {
		return pro_facility_name;
	}




	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}




	public String getPro_fa_location() {
		return pro_fa_location;
	}




	public void setPro_fa_location(String pro_fa_location) {
		this.pro_fa_location = pro_fa_location;
	}




	public int getTotalproduction_perday() {
		return totalproduction_perday;
	}




	public void setTotalproduction_perday(int totalproduction_perday) {
		this.totalproduction_perday = totalproduction_perday;
	}




	public String[] getItemnames() {
		return itemnames;
	}




	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}




	public LocalDate getProd_date() {
		return prod_date;
	}




	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}
	
	




	@Override
	public String toString() {
		return "ProductionFacility [pliid=" + pliid + ", pro_facility_name=" + pro_facility_name + ", pro_fa_location="
				+ pro_fa_location + ", totalproduction_perday=" + totalproduction_perday + ", itemnames="
				+ Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}




	public static void main(String[] args) {
	        // pfFacility1
	        ProductionFacility pd1 = new ProductionFacility(101, "Developement", "wardha", 12,
	                new String[] { "abc", "def", "aaa", "mmm", "nnnnn", "gdttyuio" }, LocalDate.of(2022, 8, 30));
	        ProductionFacility pd2 = new ProductionFacility(102, "Developement", "yavatmal", 13,
	                new String[] { "pqr", "stu", "etryy", "uytrf" }, LocalDate.of(2022, 8, 29));
	        ProductionFacility pd3 = new ProductionFacility(103, "Developement", "kanpur", 14, new String[] { "vwx", "yz" },
	                LocalDate.of(2022, 8, 28));



	       // pfFacility2
	        ProductionFacility pd11 = new ProductionFacility(201, "Testing", "amravati", 11, new String[] { "abc", "def" },
	                LocalDate.of(2022, 8, 20));
	        ProductionFacility pd12 = new ProductionFacility(202, "Testing", "washim", 12,
	                new String[] { "pqr", "stu", "uytfd", "yfd", "kjhtr", "uytrfd" }, LocalDate.of(2022, 8, 19));
	        ProductionFacility pd13 = new ProductionFacility(203, "Testing", "buldhana", 13, new String[] { "vwx", "yz" },
	                LocalDate.of(2022, 8, 18));



	       // pfFacility3
	        ProductionFacility pd21 = new ProductionFacility(301, "Production", "shegaon", 22,
	                new String[] { "abc", "def" }, LocalDate.of(2022, 8, 10));
	        ProductionFacility pd22 = new ProductionFacility(302, "Production", "nagpur", 3, new String[] { "pqr", "stu" },
	                LocalDate.of(2022, 8, 9));
	        ProductionFacility pd23 = new ProductionFacility(303, "Production", "jalgaon", 14, new String[] { "vwx", "yz" },
	                LocalDate.of(2022, 8, 8));



	       ArrayList<ProductionFacility> list = new ArrayList<>();
	        list.add(pd1);
	        list.add(pd2);
	        list.add(pd3);



	       list.add(pd11);
	        list.add(pd12);
	        list.add(pd13);



	       list.add(pd21);
	        list.add(pd22);
	        list.add(pd23);



	       // Print the details of facility with highest production per day. (you
	        // have to
	        // add at least 3 days details of each facility after that you have to
	        // calculate
	        // average of 3 days on the basis of average you have to print the
	        // facility with
	        // highest production
	        highestProduction1(list);
	        // Print detail of facility on the basis of names
	        basisOfName(list);



	       // Print which facility is producing highest item.
	        HighestItem(list);



	       // Print production detail of each facility on the basis of production
	        // date
	    }



	   private static void HighestItem(ArrayList<ProductionFacility> list) {
	        HashMap<String, Integer> map = new HashMap<>();
	        int length = 0;
	        int val = 0;
	        String facName = "";
	        for (ProductionFacility pf : list) {
	            length = pf.getItemnames().length;
	            System.out.println("length=" + length);
	            if (map.containsKey(pf.getPro_facility_name())) {
	                val = map.get(pf.getPro_facility_name());
	                if (val > length) {
	                    map.put(pf.getPro_facility_name(), val);
	                } else {
	                    map.put(pf.getPro_facility_name(), length);
	                }
	            } else {
	                map.put(pf.getPro_facility_name(), length);
	            }
	        }



	       for (Entry<String, Integer> m : map.entrySet()) {
	            System.out.println(m.getKey() + " : " + m.getValue());
	        }
	    }



	   private static void basisOfName(ArrayList<ProductionFacility> list) {
	        Collections.sort(list, new Comparator<ProductionFacility>() {



	           @Override
	            public int compare(ProductionFacility o1, ProductionFacility o2) {
	                String pfName1 = o1.getPro_facility_name();
	                String pfName2 = o2.getPro_facility_name();
	                return pfName2.compareTo(pfName1);
	            }
	        });
	        System.out.println(list);
	    }



	   private static void highestProduction1(ArrayList<ProductionFacility> list) {
	        // System.out.println(list);



	   }
	
	
	 


	   private static void basisOfName1(ArrayList<ProductionFacility> list) {
	        Collections.sort(list, new Comparator<ProductionFacility>() {



	           @Override
	            public int compare(ProductionFacility o1, ProductionFacility o2) {
	                String pfName1 = o1.getPro_facility_name();
	                String pfName2 = o2.getPro_facility_name();
	                return pfName2.compareTo(pfName1);
	            }
	        });
	        System.out.println(list);
	    }



	   private static void highestProduction(ArrayList<ProductionFacility> list) {
	        // System.out.println(list);



	   }}
	
	 