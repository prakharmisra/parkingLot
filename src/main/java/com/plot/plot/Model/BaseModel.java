package com.scalar.plot.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@Getter
@SuperBuilder
@Setter

public class BaseModel {
    public Long id;
    public Date createdAt;

    public Date updatedAt;
}
