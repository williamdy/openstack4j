package org.openstack4j.model.palcement;


import java.util.List;

import org.openstack4j.model.ModelEntity;
import org.openstack4j.openstack.common.GenericLink;

public interface ResourceProvider extends ModelEntity {

	/**
	 * get uuid of resourceProvider
	 * @return uuid
	 */
	String getUuid() ;

	/**
	 * get generation of resourceProvider
	 * @return generation
	 */
	Integer getGeneration();

	/**
	 * get name of resourceProvider
	 * @return name
	 */
	String getName();

	/**
	 * get links of resourceProviders
	 * @return links
	 */
	List<GenericLink> getLinks();
}
