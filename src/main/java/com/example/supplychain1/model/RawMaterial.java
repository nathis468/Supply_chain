package com.example.supplychain1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Document(collection="material")
@Data
public class RawMaterial {

    @Id
    private long _id;

    private Availability availability;
    @Field("RM_supplier_name")
    private String rmSupplierName;


    @Field("facilities_uid")
    private ArrayList<String> facilitiesuid;

    @Field("material_composition")
    private ArrayList<String> materialComposition;

    @Field("material_number")
    private String materialNumber;

    @Field("material_uid")
    private String materialUid;

    private String name;
    private String number;

    @Field("required_certificate")
    private ArrayList<String> requiredCertificate;

    private String season;

    @Field("supplier_id")
    private String supplierId;

    @Field("supplier_material_name")
    private String supplierMaterialName;

    private String type;
    private String year;

    @Data
    public class Availability{
        private String amount;
    }
}
