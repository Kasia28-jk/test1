package com.example.Wyk02;

import org.apache.tomcat.websocket.server.WsHttpUpgradeHandler;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Animal(String name)
    {
        this.name=name;
    }

    public Animal() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{ name" + name + "}";
    }
}
