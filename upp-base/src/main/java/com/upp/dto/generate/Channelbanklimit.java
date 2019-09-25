package com.upp.dto.generate;

import java.math.BigDecimal;

public class Channelbanklimit {
    private String id;

    private String bankcode;

    private String channelbankcode;

    private String isomnichannel;

    private String onyn;

    private BigDecimal limitamt;

    private String transtype;

    private String fundchannelcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getChannelbankcode() {
        return channelbankcode;
    }

    public void setChannelbankcode(String channelbankcode) {
        this.channelbankcode = channelbankcode;
    }

    public String getIsomnichannel() {
        return isomnichannel;
    }

    public void setIsomnichannel(String isomnichannel) {
        this.isomnichannel = isomnichannel;
    }

    public String getOnyn() {
        return onyn;
    }

    public void setOnyn(String onyn) {
        this.onyn = onyn;
    }

    public BigDecimal getLimitamt() {
        return limitamt;
    }

    public void setLimitamt(BigDecimal limitamt) {
        this.limitamt = limitamt;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getFundchannelcode() {
        return fundchannelcode;
    }

    public void setFundchannelcode(String fundchannelcode) {
        this.fundchannelcode = fundchannelcode;
    }
}