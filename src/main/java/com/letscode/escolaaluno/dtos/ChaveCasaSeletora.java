package com.letscode.escolaaluno.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChaveCasaSeletora {

    @JsonProperty(value = "sorting-hat-choice")
    private String ChaveCasaSeletora;

}
