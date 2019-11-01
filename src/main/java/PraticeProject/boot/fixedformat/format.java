package PraticeProject.boot.fixedformat;

import java.util.Date;

import com.ancientprogramming.fixedformat4j.annotation.Align;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;

@Record
public class format {
	  private String stringData;
	  private Integer integerData;
	  private Date dateData;
	  
	  @Field(offset = 1, length = 10)
	  public String getStringData() {
	    return stringData;
	  }

	  public void setStringData(String stringData) {
	    this.stringData = stringData;
	  }

	  @Field(offset = 11, length = 5, align = Align.RIGHT, paddingChar = '0')
	  public Integer getIntegerData() {
	    return integerData;
	  }

	  public void setIntegerData(Integer integerData) {
	    this.integerData = integerData;
	  }

	  @Field(offset = 16, length = 10)
	  @FixedFormatPattern("yyyy-MM-dd")
	  public Date getDateData() {
	    return dateData;
	  }

	  public void setDateData(Date dateData) {
	    this.dateData = dateData;
	  }
}
