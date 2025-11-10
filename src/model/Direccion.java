package model;

public class Direccion {
    private String calle;
    private String ciudad;
    private String region;
    private String pais;

    public Direccion(String calle, String ciudad, String region, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
    }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region + ", " + pais;
    }
}