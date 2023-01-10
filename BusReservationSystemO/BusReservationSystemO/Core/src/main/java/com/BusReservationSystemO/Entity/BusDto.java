package com.BusReservationSystemO.Entity;


import javax.persistence.*;

@Entity
@Table(name="BusRoutess")
public class BusDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name="serviceno")
    private int serviceno;

    @Column(name = "busname")
    private String busname;


    @Column(name = "bustype")
    private String bustype;

    @Column(name = "boardingpoint")
    private String boardingpoint;

    @Column(name = "droppingpoint")
    private String droppingpoint;

    @Column(name = "ammenties")
    private String ammenties;

    @Column(name = "departtime")
    private String departtime;


    @Column(name = "arrivetime")
    private String arrivetime;


    @Column(name = "journeyduration")
    private String journeyduration;


    @Column(name = "seats")
    private int seats;

    @Column(name = "fare")
    private float fare;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getServiceno() {
        return serviceno;
    }

    public void setServiceno(int serviceno) {
        this.serviceno = serviceno;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getBoardingpoint() {
        return boardingpoint;
    }

    public void setBoardingpoint(String boardingpoint) {
        this.boardingpoint = boardingpoint;
    }

    public String getDroppingpoint() {
        return droppingpoint;
    }

    public void setDroppingpoint(String droppingpoint) {
        this.droppingpoint = droppingpoint;
    }

    public String getAmmenties() {
        return ammenties;
    }

    public void setAmmenties(String ammenties) {
        this.ammenties = ammenties;
    }

    public String getDeparttime() {
        return departtime;
    }

    public void setDeparttime(String departtime) {
        this.departtime = departtime;
    }

    public String getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(String arrivetime) {
        this.arrivetime = arrivetime;
    }

    public String getJourneyduration() {
        return journeyduration;
    }

    public void setJourneyduration(String journeyduration) {
        this.journeyduration = journeyduration;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }
}



