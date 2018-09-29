package org.openstack4j.api.placement;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.palcement.ResourceProvider;
import org.openstack4j.openstack.placement.domain.PlacementResourceProvider;

public interface ResourceProviderService  extends RestService {

    /**
     * List all ResourceProviders
     * 
     * @return list of ResourceProviders or empty
     */
     List<? extends ResourceProvider> list();

     /**
      * get PlacementResourceProvider by id
      * 
      * @param resourceProviderId
      * @return PlacementResourceProvider by id
      */
     PlacementResourceProvider get(String resourceProviderId);

     /**
      * 
      * @param resourceProviderId
      * @return
      */
	 ActionResponse delete(String resourceProviderId);
	 
	 /**
	  * 
	  * @param resourceProvider
	  * @return
	  */
   	 PlacementResourceProvider update(PlacementResourceProvider resourceProvider);
	 

}
