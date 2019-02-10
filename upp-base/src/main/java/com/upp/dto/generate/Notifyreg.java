package com.upp.dto.generate;

import java.util.Date;

public class Notifyreg {
    private String notifynbr;

    private String uppertransnbr;

    private Date transdate;

    private String mernbr;

    private String uppersysnbr;

    private String notifystatus;

    private Date crtdatetime;

    private Date datelastmaint;

    public String getNotifynbr() {
        return notifynbr;
    }

    public void setNotifynbr(String notifynbr) {
        this.notifynbr = notifynbr;
    }

    public String getUppertransnbr() {
        return uppertransnbr;
    }

    public void setUppertransnbr(String uppertransnbr) {
        this.uppertransnbr = uppertransnbr;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }

    public String getMernbr() {
        return mernbr;
    }

    public void setMernbr(String mernbr) {
        this.mernbr = mernbr;
    }

    public String getUppersysnbr() {
        return uppersysnbr;
    }

    public void setUppersysnbr(String uppersysnbr) {
        this.uppersysnbr = uppersysnbr;
    }

    public String getNotifystatus() {
        return notifystatus;
    }

    public void setNotifystatus(String notifystatus) {
        this.notifystatus = notifystatus;
    }

    public Date getCrtdatetime() {
        return crtdatetime;
    }

    public void setCrtdatetime(Date crtdatetime) {
        this.crtdatetime = crtdatetime;
    }

    public Date getDatelastmaint() {
        return datelastmaint;
    }

    public void setDatelastmaint(Date datelastmaint) {
        this.datelastmaint = datelastmaint;
    }
}