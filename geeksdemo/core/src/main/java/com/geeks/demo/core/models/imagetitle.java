package com.geeks.demo.core.models;

import javax.annotation.Resource;
import javax.inject.Inject;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class)
public class imagetitle {
	@Inject
	@Default(values="No resourceType")
	private String image;
	
	@Inject
	@Default(values="No resourceType")
	private String title;

	

	public String getImage() {
		return image;
	}



	public String getTitle() {
		return title;
	}
}
