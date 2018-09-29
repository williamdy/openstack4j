package org.openstack4j.openstack.placement.internal;

import java.util.List;

import org.openstack4j.api.placement.ResourceProviderService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.image.Image;
import org.openstack4j.model.palcement.ResourceProvider;
import org.openstack4j.openstack.image.domain.GlanceImage;
import org.openstack4j.openstack.image.domain.functions.ImageForUpdateToHeaders;
import org.openstack4j.openstack.octavia.domain.OctaviaLoadBalancerV2;
import org.openstack4j.openstack.placement.domain.PlacementResourceProvider;
import org.openstack4j.openstack.placement.domain.PlacementResourceProvider.ResourceProviders;

import static com.google.common.base.Preconditions.checkNotNull;

public class ResourceProviderServiceImpl  extends BasePlacementServices implements ResourceProviderService {

	@Override
	public List<? extends ResourceProvider> list() {
		return get(ResourceProviders.class, uri("/resource_providers")).execute().getList();
	}
	
	@Override
	public PlacementResourceProvider get(String resourceProviderId) {
		checkNotNull(resourceProviderId);
		return get(PlacementResourceProvider.class, uri("/resource_providers/%s",resourceProviderId)).param("format", "json").execute();
	}

	@Override
	public ActionResponse delete(String resourceProviderId) {
		checkNotNull(resourceProviderId);
		return deleteWithResponse(
				uri("/resource_providers/%s", resourceProviderId)).param(
				"format", "json").execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlacementResourceProvider update(
			PlacementResourceProvider resourceProvider) {
		checkNotNull(resourceProvider);
		checkNotNull(resourceProvider.getUuid());
		
	    return put(PlacementResourceProvider.class, uri("/resource_providers/%s",resourceProvider.getUuid())).entity(resourceProvider).execute();
	   
	}
}
