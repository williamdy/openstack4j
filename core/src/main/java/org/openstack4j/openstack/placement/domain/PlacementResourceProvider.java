package org.openstack4j.openstack.placement.domain;


import java.util.List;

import org.openstack4j.model.palcement.ResourceProvider;
import org.openstack4j.openstack.common.GenericLink;
import org.openstack4j.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlacementResourceProvider implements ResourceProvider {

	//TODO jsonobject完善
	@JsonProperty("uuid")
	private String uuid;
	
	@JsonProperty("generation")
	private Integer generation;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("links")
	private List<GenericLink> links;
	
	public String getUuid() {
		return uuid;
	}

	public Integer getGeneration() {
		return generation;
	}

	public String getName() {
		return name;
	}

	public List<GenericLink> getLinks() {
		return links;
	}
	
	public static class ResourceProviders extends ListResult<PlacementResourceProvider> {

		private static final long serialVersionUID = 1L;

		@JsonProperty("resource_providers")
		private List<PlacementResourceProvider> resourceProviders;

		@Override
		protected List<PlacementResourceProvider> value() {
			return resourceProviders;
		}
	}
}
