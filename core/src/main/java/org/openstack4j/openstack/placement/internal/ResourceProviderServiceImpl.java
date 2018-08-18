package org.openstack4j.openstack.placement.internal;

import java.util.List;

import org.openstack4j.api.placement.ResourceProviderService;
import org.openstack4j.model.palcement.ResourceProvider;
import org.openstack4j.openstack.internal.BaseOpenStackService;
import org.openstack4j.openstack.placement.domain.PlacementResourceProvider.ResourceProviders;

public class ResourceProviderServiceImpl  extends BasePlacementServices implements ResourceProviderService {

	@Override
	public List<? extends ResourceProvider> list() {
		return get(ResourceProviders.class, uri("/resource_providers")).execute().getList();
	}

}
