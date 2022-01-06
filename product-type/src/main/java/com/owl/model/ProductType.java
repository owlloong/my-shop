package com.owl.model;

import lombok.Data;

@Data
public class ProductType {

    private int id;

    private String productTypeName;

    private String productTypeDescription;

    private String typeLevel; //等级类别，例如1、2、3。1表示为最大类别

    private int parentId;//如果是第一类别，父节点为-1
}
