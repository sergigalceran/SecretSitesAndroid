package edu.upc.eetac.dsa.secretsites.client.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergi1 on 04/05/2016.
 */
public class InterestPointCollection {
    private List<Link> links;
    private long newestTimestamp;
    private long oldestTimestamp;
    private double area;
    private List<InterestPoint> interestPoints = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public long getNewestTimestamp() {
        return newestTimestamp;
    }

    public void setNewestTimestamp(long newestTimestamp) {
        this.newestTimestamp = newestTimestamp;
    }

    public long getOldestTimestamp() {
        return oldestTimestamp;
    }

    public void setOldestTimestamp(long oldestTimestamp) {
        this.oldestTimestamp = oldestTimestamp;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<InterestPoint> getInterestPoints() {
        return interestPoints;
    }

    public void setInterestPoints(List<InterestPoint> interestPoints) {
        this.interestPoints = interestPoints;
    }
}
