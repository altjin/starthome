package com.codeT.starthome.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Data
public class Board {

    private Long id;
    private String title;
    private String content;
}
