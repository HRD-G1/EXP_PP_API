package org.khmeracademy.epseeker.entities;

public class University {

	private int universityID;
	private String universityName;
	private String universityDescription;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param universityID
	 * @param universityName
	 * @param universityDescription
	 */
	public University(int universityID, String universityName, String universityDescription) {
		this.universityID = universityID;
		this.universityName = universityName;
		this.universityDescription = universityDescription;
	}

	/**
	 * @return the universityID
	 */
	public int getUniversityID() {
		return universityID;
	}

	/**
	 * @param universityID the universityID to set
	 */
	public void setUniversityID(int universityID) {
		this.universityID = universityID;
	}

	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * @return the universityDescription
	 */
	public String getUniversityDescription() {
		return universityDescription;
	}

	/**
	 * @param universityDescription the universityDescription to set
	 */
	public void setUniversityDescription(String universityDescription) {
		this.universityDescription = universityDescription;
	}
	
	
	
}
