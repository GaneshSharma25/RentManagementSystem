package Validations;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

import coreClass.Owner;
import coreClass.PropertyType;
import exceptionHandling.PropertyRentException;

public class ValidationRules {
	// String adharNo, String firstname, String lastname, String email, String
	// address, String mobno,
	// PropertyType propertyType,LocalDate bookingDate, int rent

	public static Owner validateAndParseOwner(String aadhaarNo, String firstname, String lastname, String email,
			String address, String mobno, String propertyType, String bookingDate, int rent, Set<Owner> owner)
			throws PropertyRentException {
		validateDups(owner,aadhaarNo);
		LocalDate validDate = validateAndParseDate(bookingDate);
		PropertyType validPropertyType = validateAndParsePropertyType(propertyType);

		return new Owner(aadhaarNo, firstname, lastname, email, address, mobno, validPropertyType, validDate, rent);
	}
	
	public static void validateDups(Set<Owner> owner,String aadhaaNo) throws PropertyRentException {
		
		Iterator<Owner> itr = owner.iterator();
		while(itr.hasNext()) {
			if(itr.next().getAadhaarNo().equals(aadhaaNo)) {
				throw new PropertyRentException("Duplicate Found..");
			}
		}
	}

	public static LocalDate validateAndParseDate(String date) throws PropertyRentException {

		LocalDate dt = LocalDate.parse(date);

		if (dt.isBefore(LocalDate.now())) {
			throw new PropertyRentException("Invalid date..");
		}
		return dt;
	}

	public static PropertyType validateAndParsePropertyType(String propTyp) {
		return PropertyType.valueOf(propTyp.toUpperCase());
	}

}
