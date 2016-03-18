/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mylittlepet;

/**
 *
 * @author kornelia
 */

public class Pet {
    private String name;
    private Integer eating;
    private Integer playing;
    private Sex sex;

    public Pet() {
    }

    public Pet(String name, Integer eating, Integer playing, Sex sex) {
        this.name = name;
        this.eating = eating;
        this.playing = playing;
        this.sex = sex;
    }

    public Pet(String name, Sex sex) {
        this.name = name;
        this.eating = 8;
        this.playing = 8;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEating() {
        return eating;
    }

    public void setEating(Integer eating) {
        this.eating = eating;
    }

    public Integer getPlaying() {
        return playing;
    }

    public void setPlaying(Integer playing) {
        this.playing = playing;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public void feed(){
        this.setEating(10);
    }
    public void play(){
        this.setPlaying(10);
    }
    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", eating=" + eating + ", playing=" + playing + ", sex=" + sex + '}';
    }
    
    
    
}
