package Creationale.X_Practice.GestionareCamereHotel.models;

import java.util.ArrayList;
import java.util.List;

public class CameraBuilder implements Builder {
    private int id = -1;
    private TipCamera tipCamera = TipCamera.INVALID;
    private boolean haveBalcony = false;
    private List<String> facilities = new ArrayList<>();

    public CameraBuilder() {
    }

    public CameraBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public CameraBuilder setTipCamera(TipCamera tipCamera) {
        this.tipCamera = tipCamera;
        return this;
    }

    public CameraBuilder setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
        return this;
    }

    public CameraBuilder setFacilities(List<String> facilities) {
        this.facilities = facilities;
        return this;
    }

    @Override
    public Camera build() {
        Camera camera = null;

        if (id == -1 || tipCamera == TipCamera.INVALID) {
            System.out.println("[ERROR]: Camera must have a valid id and type.");
        } else if (tipCamera == TipCamera.SUITE && facilities.size() < 2) {
            System.out.println("[ERROR]: SUITE camera must have at least 2 facilities.");
        } else if (facilities.contains("jacuzzi") && !haveBalcony) {
            System.out.println("[ERROR]: Camera with jacuzzi must have a balcony.");
        } else {
            camera = new Camera(id, tipCamera, haveBalcony, facilities);
        }

        this.id = -1;
        this.tipCamera = TipCamera.INVALID;
        this.haveBalcony = false;
        this.facilities = new ArrayList<>();

        return camera;
    }
}
