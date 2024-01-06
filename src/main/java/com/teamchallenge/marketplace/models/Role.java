package com.teamchallenge.marketplace.models;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
@Accessors(chain = true)
public class Role {
    private String id;
    @Field("name")
    private RoleName name;
    private enum RoleName {
        ADMIN,
        USER,
        GUEST
    }
}
