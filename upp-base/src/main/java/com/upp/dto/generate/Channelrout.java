package com.upp.dto.generate;

import java.math.BigDecimal;

public class Channelrout {
    private String fundchannelcode;

    private String routstate;

    private String priority;

    private BigDecimal limitamt;

    public String getFundchannelcode() {
        return fundchannelcode;
    }

    public void setFundchannelcode(String fundchannelcode) {
        this.fundchannelcode = fundchannelcode;
    }

    public String getRoutstate() {
        return routstate;
    }

    public void setRoutstate(String routstate) {
        this.routstate = routstate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public BigDecimal getLimitamt() {
        return limitamt;
    }

    public void setLimitamt(BigDecimal limitamt) {
        this.limitamt = limitamt;
    }
}