package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegSealDetail;

public class LegSealDetailDto extends LegSealDetail {

    private LegAttachment attachment;

    public LegAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(LegAttachment attachment) {
        this.attachment = attachment;
    }
}
