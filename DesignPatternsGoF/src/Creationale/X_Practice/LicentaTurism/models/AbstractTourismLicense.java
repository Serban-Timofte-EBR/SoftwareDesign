package Creationale.X_Practice.LicentaTurism.models;

public interface AbstractTourismLicense {
    void setLicenseNumber(String newLicenceNumber) throws TooManyChangeLicenceRequests;
}
