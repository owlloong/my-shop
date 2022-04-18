package com.owl.model;

import lombok.Data;

@Data
public class Merchant {

    private int id;

    private String merchantName;

    private String merchantShopName;

    private String merchantAccount;

    private String merchantPassword;

    private String merchantScope;

    private int auditStatus;

    private int soldOut;

}
