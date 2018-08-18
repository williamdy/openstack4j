package org.openstack4j.openstack.placement.internal;


import org.openstack4j.api.types.ServiceType;
import org.openstack4j.openstack.internal.BaseOpenStackService;

public class BasePlacementServices  extends BaseOpenStackService {


			protected BasePlacementServices() {
				super(ServiceType.PLACEMENT);
			}

}
