package io.oasp.gastronomy.restaurant.offermanagement.logic.api;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcFindOffer;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcFindProduct;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcFindSpecial;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcManageOffer;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcManageProduct;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcManageSpecial;

/**
 * Interface for Offermanagement.
 *
 * @author loverbec
 */
public interface Offermanagement extends UcFindOffer, UcManageOffer, UcManageProduct, UcFindProduct, UcFindSpecial,
    UcManageSpecial {

}
