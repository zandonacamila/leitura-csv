package br.com.alura.model;

public class EnergiaRenovavel {

	String year;
	String resource;
	String variable;
	String units;
	String magnitude;
	String source;
	String dataValue;
	String flag;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(String magnitude) {
		this.magnitude = magnitude;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDataValue() {
		return dataValue;
	}

	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "EnergiaRenovavel [year=" + year + ", resource=" + resource + ", variable=" + variable + ", units="
				+ units + ", magnitude=" + magnitude + ", source=" + source + ", dataValue=" + dataValue + ", flag="
				+ flag + "]";
	}

}
