/**
 * 
 */
package study.pattern.training.dataprocessing.model;

/**
 * @author madhukargunda
 *
 */
public class Student {
	
	
	private long rollnumber;
	
	private String name;
	
	private int marks;
	
	private String grade;
	
	private boolean result;

	public long getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(long rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", marks=" + marks + ", grade=" + grade
				+ ", result=" + result + "]";
	} 
	
	
}
