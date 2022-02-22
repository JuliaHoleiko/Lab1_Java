package com.company;

public record Camera(String producer, int memoryCapacityInMB, int zoomRatio, double weightInKg, boolean presenceOfOutbreak, String color) {
    public static int warrantyDurationInMonths = 12;

    public Camera(String producer, int memoryCapacityInMB, int zoomRatio) {
        this(producer, memoryCapacityInMB, zoomRatio, 0, false, null);
    }


    public Camera (){
        this("", 0,0,0.0,true,"");
    }

    @Override
    public String toString() {
        return "Camera{" +
                "producer='" + producer + '\'' +
                ", memoryCapacityInMB=" + memoryCapacityInMB +
                ", zoomRatio=" + zoomRatio +
                ", weightInKg=" + weightInKg +
                ", presenceOfOutbreak=" + presenceOfOutbreak +
                ", color='" + color + '\'' +
                '}';
    }

    public static int getWarrantyDurationInMonths() {
        return warrantyDurationInMonths;
    }
}
