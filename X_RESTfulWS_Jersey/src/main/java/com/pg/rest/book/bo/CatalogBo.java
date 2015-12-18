package com.pg.rest.book.bo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CatalogBo {

	private String catalogId;
	private String catalogType;
	
	public CatalogBo() {}
	
	public CatalogBo(String catalogId, String catalogType) {
		this.catalogId = catalogId;
		this.catalogType = catalogType;
	}
	
	public String getCatalogId() {
		return catalogId;
	}
	public String getCatalogType() {
		return catalogType;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public void setCatalogType(String catalogType) {
		this.catalogType = catalogType;
	}
	
	public static CatalogBo retrievCatalog(String catId) {
		return new CatalogBo.CatalogBoItems().retriveCatalog(catId);
	}
	
	private static class CatalogBoItems{

		List<CatalogBo> catalogBoList = new ArrayList<CatalogBo>(0);
		
		public CatalogBoItems() {
			for(int count=0;count<10;count++){
				catalogBoList.add(new CatalogBo("CAT01"+count, "ART_"+count));
			}
		}
		
		public CatalogBo retriveCatalog(String catalogId) {
			for(CatalogBo catBo : catalogBoList){
				if(null != catBo && null != catalogId
						&& catalogId.equalsIgnoreCase(catBo.getCatalogId())){
					return catBo;
				}
			}
			return null;
		}
		
	}
	
	@Override
	public String toString() {
		
		return "CatalogBo{"+this.getCatalogId()+","+this.getCatalogType()+"}";
	}
}
