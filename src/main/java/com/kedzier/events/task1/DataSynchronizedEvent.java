package com.kedzier.events.task1;

import java.util.Date;

/**
 * @author kedzierm
 */
public class DataSynchronizedEvent {

    private Date syncDate;

    public DataSynchronizedEvent(Date date) {
        this.syncDate = date;
    }

    public Date getSyncDate() {
        return syncDate;
    }

}
