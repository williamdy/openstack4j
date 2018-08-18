package org.openstack4j.api.placement;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.palcement.ResourceProvider;

public interface ResourceProviderService  extends RestService {

    /**
     * List all ResourceProviders
     * 
     * @return list of ResourceProviders or empty
     */
     List<? extends ResourceProvider> list();

}
