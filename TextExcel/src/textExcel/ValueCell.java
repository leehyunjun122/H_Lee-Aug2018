// @author Alex Lee
// @version March 19, 2019
//This class contain methods for the value cell

package textExcel;

public class ValueCell extends RealCell {
	//constructor
	public ValueCell(String valueInput) {
		super(valueInput);
	}
	//Returns the value cell truncated to the length of 10
	public String abbreviatedCellText() {
		String value = this.getDoubleValue()+"          ";//gets the value from the superclass with the method getDoubleValue() and adds 10 spaces in order to fill up the needed part
		return (value.substring(0, 10));
	}
}