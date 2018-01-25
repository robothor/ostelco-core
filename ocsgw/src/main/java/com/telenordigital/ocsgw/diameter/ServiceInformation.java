package com.telenordigital.ocsgw.diameter;


import org.jdiameter.api.Avp;
import org.jdiameter.api.AvpDataException;
import org.jdiameter.api.AvpSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

class ServiceInformation {
    private static final Logger logger = LoggerFactory.getLogger(ServiceInformation.class);
    private final PsInformation psInformation = new PsInformation();

    public PsInformation getPsinformation() {
        return psInformation;
    }

    public void parseApvs(Avp serviceInformationAvp) {
        try {
            Optional<Avp> psInformationAvp = null;
            psInformationAvp = Optional.ofNullable(serviceInformationAvp.getGrouped().getAvp(Avp.PS_INFORMATION));
            if (psInformationAvp.isPresent()) {
                AvpSet psInformationAvps = psInformationAvp.get().getGrouped();
                psInformation.parseAvps(psInformationAvps);
            } else {
                logger.info("No PS-Information");
            }
        } catch (AvpDataException e) {
            logger.error("Failed to parse Service-Information", e);
        }
    }
}
