package com.apirest.webflux.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Playlist {

    @Id
    private String id;

    private String nome;

    public Playlist(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
