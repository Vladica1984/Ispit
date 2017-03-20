package com.example.androiddevelopment.imenik.model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import static com.example.androiddevelopment.imenik.model.Kontakt.FIELD_NAME_ADDRESS;
import static com.example.androiddevelopment.imenik.model.Kontakt.FIELD_NAME_IMAGE;
import static com.example.androiddevelopment.imenik.model.Kontakt.FIELD_NAME_PHONEHOME;
import static com.example.androiddevelopment.imenik.model.Kontakt.FIELD_NAME_PHONEMOBIL;
import static com.example.androiddevelopment.imenik.model.Kontakt.FIELD_NAME_PHONEOFFICE;

/**
 * Created by androiddevelopment on 20.3.17..
 */
@DatabaseTable(tableName = Kontakt.TABLE_NAME_USERS)
public class Kontakt {

    public static final String TABLE_NAME_USERS  = "kontakt";
    public static final String FIELD_NAME_ID     = "id";
    public static final String FIELD_NAME_IMAGE = "slika";
    public static final String FIELD_NAME_NAME   = "ime";
    public static final String FIELD_NAME_LASTNAME = "prezime";
    public static final String FIELD_NAME_PHONEHOME = "telefon kucni";
    public static final String FIELD_NAME_PHONEOFFICE = "telefon posao";
    public static final String FIELD_NAME_PHONEMOBIL = "telefon mobilni";
    public static final String FIELD_NAME_ADDRESS = "adresa";
    public static final String FIELD_NAME_IMENIK = "imenik";

    @DatabaseField(columnName = FIELD_NAME_ID, generatedId = true)
    private int idKontakt;

    @DatabaseField(columnName = FIELD_NAME_IMAGE)
    private String slikaKontakt;

    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String imeKontakt;

    @DatabaseField(columnName = FIELD_NAME_LASTNAME)
    private String prezimeKontakt;

    @DatabaseField(columnName = FIELD_NAME_PHONEHOME)
    private String kucaTelefon;

    @DatabaseField(columnName = FIELD_NAME_PHONEOFFICE)
    private String posaoTelefon;

    @DatabaseField(columnName = FIELD_NAME_PHONEMOBIL)
    private String mobilniTelefon;

    @DatabaseField(columnName = FIELD_NAME_ADDRESS)
    private String adresa;

    @ForeignCollectionField(columnName = Kontakt.FIELD_NAME_IMENIK, eager = true)
    private ForeignCollection<Imenik> imenik;

    public Kontakt() {

    }

    public int getIdKontakt() {
        return idKontakt;
    }

    public void setIdKontakt(int idKontakt) {
        this.idKontakt = idKontakt;
    }

    public String getSlikaKontakt() {
        return slikaKontakt;
    }

    public void setSlikaKontakt(String slikaKontakt) {
        this.slikaKontakt = slikaKontakt;
    }

    public String getImeKontakt() {
        return imeKontakt;
    }

    public void setImeKontakt(String imeKontakt) {
        this.imeKontakt = imeKontakt;
    }

    public String getPrezimeKontakt() {
        return prezimeKontakt;
    }

    public void setPrezimeKontakt(String prezimeKontakt) {
        this.prezimeKontakt = prezimeKontakt;
    }

    public String getKucaTelefon() {
        return kucaTelefon;
    }

    public void setKucaTelefon(String kucaTelefon) {
        this.kucaTelefon = kucaTelefon;
    }

    public String getPosaoTelefon() {
        return posaoTelefon;
    }

    public void setPosaoTelefon(String posaoTelefon) {
        this.posaoTelefon = posaoTelefon;
    }

    public String getMobilniTelefon() {
        return mobilniTelefon;
    }

    public void setMobilniTelefon(String mobilniTelefon) {
        this.mobilniTelefon = mobilniTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ForeignCollection<Imenik> getImenik() {
        return imenik;
    }

    public void setImenik(ForeignCollection<Imenik> imenik) {
        this.imenik = imenik;
    }

    public String toString() {
        return imeKontakt;
    }
}
