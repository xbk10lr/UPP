package com.upp.dto.generate;

import java.util.Date;

public class Transexceptionreg {
    private String exceppseqnbr;

    private Date transdate;

    private String innerfundtransnbr;

    private String overalltransnbr;

    private String fundchannelcode;

    private Integer retrytimes;

    private Integer maxretrytimes;

    private Date lastretrytime;

    private String handlestatus;

    private String excepservicename;

    private String excepmethodname;

    private String excepdesc;

    public String getExceppseqnbr() {
        return exceppseqnbr;
    }

    public void setExceppseqnbr(String exceppseqnbr) {
        this.exceppseqnbr = exceppseqnbr;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }

    public String getInnerfundtransnbr() {
        return innerfundtransnbr;
    }

    public void setInnerfundtransnbr(String innerfundtransnbr) {
        this.innerfundtransnbr = innerfundtransnbr;
    }

    public String getOveralltransnbr() {
        return overalltransnbr;
    }

    public void setOveralltransnbr(String overalltransnbr) {
        this.overalltransnbr = overalltransnbr;
    }

    public String getFundchannelcode() {
        return fundchannelcode;
    }

    public void setFundchannelcode(String fundchannelcode) {
        this.fundchannelcode = fundchannelcode;
    }

    public Integer getRetrytimes() {
        return retrytimes;
    }

    public void setRetrytimes(Integer retrytimes) {
        this.retrytimes = retrytimes;
    }

    public Integer getMaxretrytimes() {
        return maxretrytimes;
    }

    public void setMaxretrytimes(Integer maxretrytimes) {
        this.maxretrytimes = maxretrytimes;
    }

    public Date getLastretrytime() {
        return lastretrytime;
    }

    public void setLastretrytime(Date lastretrytime) {
        this.lastretrytime = lastretrytime;
    }

    public String getHandlestatus() {
        return handlestatus;
    }

    public void setHandlestatus(String handlestatus) {
        this.handlestatus = handlestatus;
    }

    public String getExcepservicename() {
        return excepservicename;
    }

    public void setExcepservicename(String excepservicename) {
        this.excepservicename = excepservicename;
    }

    public String getExcepmethodname() {
        return excepmethodname;
    }

    public void setExcepmethodname(String excepmethodname) {
        this.excepmethodname = excepmethodname;
    }

    public String getExcepdesc() {
        return excepdesc;
    }

    public void setExcepdesc(String excepdesc) {
        this.excepdesc = excepdesc;
    }
}