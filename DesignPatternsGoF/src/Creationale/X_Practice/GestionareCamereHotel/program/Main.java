package Creationale.X_Practice.GestionareCamereHotel.program;

import Creationale.X_Practice.GestionareCamereHotel.models.Camera;
import Creationale.X_Practice.GestionareCamereHotel.models.CameraBuilder;
import Creationale.X_Practice.GestionareCamereHotel.models.TipCamera;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CameraBuilder builder = new CameraBuilder();

            Camera cameraIeftina = builder
                    .setId(21)
                    .setTipCamera(TipCamera.SINGLE)
                    .setHaveBalcony(false)
                    .setFacilities(List.of("bar", "mic dejun"))
                    .build();

            cameraIeftina.afiseazaDetalii();

            Camera cameraSuiteFail = builder
                    .setId(42)
                    .setTipCamera(TipCamera.SUITE)
                    .setHaveBalcony(true)
                    .setFacilities(List.of("mic dejun"))
                    .build();

            if (cameraSuiteFail == null) {
                System.out.println("Camera nu a fost creata cu succes.");
            }

            Camera cameraSuite = builder
                    .setId(42)
                    .setTipCamera(TipCamera.SUITE)
                    .setHaveBalcony(true)
                    .setFacilities(List.of("jacuzzi", "bar", "mic dejun"))
                    .build();

            cameraSuite.afiseazaDetalii();
            cameraIeftina.afiseazaDetalii();

            Camera cameraJacuzziNoBalcon = builder
                    .setId(72)
                    .setTipCamera(TipCamera.SUITE)
                    .setHaveBalcony(false)
                    .setFacilities(List.of("jacuzzi", "bar", "mic dejun"))
                    .build();

        if (cameraJacuzziNoBalcon == null) {
            System.out.println("Camera nu a fost creata cu succes.");
        }

            Camera cameraIncompleta = builder
                    .setId(99)
                    .setTipCamera(TipCamera.DOUBLE)
                    .build();

            if (cameraIncompleta == null) {
                System.out.println("[Camera Incompleta]: Camera nu a fost creata cu succes.");
            } else {
                cameraIncompleta.afiseazaDetalii();
            }
    }
}
