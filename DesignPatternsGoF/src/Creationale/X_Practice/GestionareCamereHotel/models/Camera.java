package Creationale.X_Practice.GestionareCamereHotel.models;

import java.util.ArrayList;
import java.util.List;

public class Camera implements Cloneable {
    private int id;
    private TipCamera tipCamera;
    private boolean haveBalcony;
    private List<String> facilities;

    public Camera() {
        this.facilities = new ArrayList<>();
    }

    protected Camera(int id, TipCamera tipCamera, boolean haveBalcony, List<String> facilities) {
        this.id = id;
        this.tipCamera = tipCamera;
        this.haveBalcony = haveBalcony;
        this.facilities = new ArrayList<>(facilities);
    }

    public int getId() {
        return id;
    }

    public TipCamera getTipCamera() {
        return tipCamera;
    }

    public boolean isHaveBalcony() {
        return haveBalcony;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setTipCamera(TipCamera tipCamera) {
        this.tipCamera = tipCamera;
    }

    protected void setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
    }

    protected void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Camera clone = (Camera) super.clone();
        clone.facilities = new ArrayList<>(this.facilities);
        return clone;
    }

    public void afiseazaDetalii() {
        if (this.id == -1 || this.tipCamera == TipCamera.INVALID) {
            return;
        }
        System.out.println("Camera - ID: " + this.id);
        System.out.println("\tTip Camera: " + this.tipCamera);
        System.out.println("\tBalcon: " + (this.haveBalcony ? "Da" : "Nu"));
        System.out.println("\tFacilitati: " + this.facilities);
    }
}
