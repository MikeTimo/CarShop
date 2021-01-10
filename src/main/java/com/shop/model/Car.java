package com.shop.model;

import java.time.LocalDate;

public class Car {
    private Long id;
    private String make;
    private String model;
    private BodyType bodyType;
    private LocalDate date;
    private TransmissionType transmissionType;
    private String exteriorColor;
    private String interiorColor;
    private Double engine;
    private DriveTrain driveTrain;
    private Double price;
    private FuelType fuelType;
    private Double kilometres;

    public Car() {
    }

    public Car(Long id, String make, String model, BodyType bodyType, LocalDate date, TransmissionType transmissionType, String exteriorColor, String interiorColor, Double engine, DriveTrain driveTrain, Double price, FuelType fuelType, Double kilometres) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.date = date;
        this.transmissionType = transmissionType;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.engine = engine;
        this.driveTrain = driveTrain;
        this.price = price;
        this.fuelType = fuelType;
        this.kilometres = kilometres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public DriveTrain getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(DriveTrain driveTrain) {
        this.driveTrain = driveTrain;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Double getKilometres() {
        return kilometres;
    }

    public void setKilometres(Double kilometres) {
        this.kilometres = kilometres;
    }
}
