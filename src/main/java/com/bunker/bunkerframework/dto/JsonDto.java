package com.bunker.bunkerframework.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serial;
import java.io.Serializable;

@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
}
