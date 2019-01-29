package com.upp.dto.generate;

import java.util.Date;

public class InnerfundtransKey {
    private String innerfundtransnbr;

    private Date transdate;

    public String getInnerfundtransnbr() {
        return innerfundtransnbr;
    }

    public void setInnerfundtransnbr(String innerfundtransnbr) {
        this.innerfundtransnbr = innerfundtransnbr;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }
}