package entity;

public class Medicine {
	private String iNNcode;
	private String NameMedin;
	private int IdCate;
	private String DosageForm;
	private String PathImg;
	private String content;
	private String ingredient;
	
	public Medicine() {}
	public Medicine(String iNNcode, String nameMedin, int idCate, String dosageForm, String pathImg, String content,
			String ingredient) {
		this.iNNcode = iNNcode;
		NameMedin = nameMedin;
		IdCate = idCate;
		DosageForm = dosageForm;
		PathImg = pathImg;
		this.content = content;
		this.ingredient = ingredient;
	}
	public String getiNNcode() {
		return iNNcode;
	}
	public void setiNNcode(String iNNcode) {
		this.iNNcode = iNNcode;
	}
	public String getNameMedin() {
		return NameMedin;
	}
	public void setNameMedin(String nameMedin) {
		NameMedin = nameMedin;
	}
	public int getIdCate() {
		return IdCate;
	}
	public void setIdCate(int idCate) {
		IdCate = idCate;
	}
	public String getDosageForm() {
		return DosageForm;
	}
	public void setDosageForm(String dosageForm) {
		DosageForm = dosageForm;
	}
	public String getPathImg() {
		return PathImg;
	}
	public void setPathImg(String pathImg) {
		PathImg = pathImg;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	 
	
}
