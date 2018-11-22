package com.upp.dto.generate;

import java.util.Date;

public class FundtransKey {
    private String fundtransnbr;

    private Date transdate;

    public String getFundtransnbr() {
        return fundtransnbr;
    }

    public void setFundtransnbr(String fundtransnbr) {
        this.fundtransnbr = fundtransnbr;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }
}