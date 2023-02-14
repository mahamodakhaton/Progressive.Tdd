package progressiveTddUtils;

public class AutoData {
	private String validatehomePageText;
	private String zipCode;
	private String firstName;
	private String lastName;
	private String dateofBirth;

	public AutoData(String validatehomePageText, String zipCode, String firstName, String lastName,
			String dateofBirth) {
		if (validatehomePageText == null || zipCode == null || firstName == null || lastName == null
				|| dateofBirth == null || validatehomePageText.length() == 0 || zipCode.length() == 0
				|| firstName.length() == 0 || lastName.length() == 0 || dateofBirth.length() == 0) {
			throw new NullPointerException();
		} else {
			this.validatehomePageText = validatehomePageText;
			this.zipCode = zipCode;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateofBirth = dateofBirth;

		}
	}

	

	public String getValidatehomePageText() {
		return validatehomePageText;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

}