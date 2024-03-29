package br.com.garug.mtg.entities.suppliers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForeignData {
    private String name;
    private String text;
    private String flavor;
    private String imageUrl;
    private String language;
    @JsonProperty(value = "multiverseid")
    private int multiverseId;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getMultiverseId() {
		return multiverseId;
	}
	public void setMultiverseId(int multiverseId) {
		this.multiverseId = multiverseId;
	}
}
