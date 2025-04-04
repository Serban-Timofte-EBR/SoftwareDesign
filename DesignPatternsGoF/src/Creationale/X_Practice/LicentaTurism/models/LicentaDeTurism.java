package Creationale.X_Practice.LicentaTurism.models;

public class LicentaDeTurism implements AbstractTourismLicense{
    private static LicentaDeTurism instance;

    private String licenseNumber;
    private boolean isLicenceNumberChanged;

    private LicentaDeTurism() {
        this.licenseNumber = "";
        this.isLicenceNumberChanged = false;
    }

    public static synchronized LicentaDeTurism getInstance() {
        if (instance == null) {
            instance = new LicentaDeTurism();
        }
        return instance;
    }

    @Override
    public void setLicenseNumber(String newLicenceNumber) throws TooManyChangeLicenceRequests {
        if (this.isLicenceNumberChanged) {
            throw new TooManyChangeLicenceRequests("The licence number has already been changed.");
        } else {
            this.licenseNumber = newLicenceNumber;
            this.isLicenceNumberChanged = true;
            System.out.println("Licence number changed to: " + this.licenseNumber);
        }
    }
}
