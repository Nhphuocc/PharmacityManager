package entity;

public class DrugCategory {
	private int idCate;
	private String CategoryName;
	
	
	public DrugCategory() {}
	
	public DrugCategory(int idCate, String categoryName) {
		super();
		this.idCate = idCate;
		CategoryName = categoryName;
	}

	public int getIdCate() {
		return idCate;
	}

	public void setIdCate(int idCate) {
		this.idCate = idCate;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	@Override
	public String toString() {
	    return getCategoryName() + " (id:" + getIdCate() + ")";
	}

	
	
	
}
