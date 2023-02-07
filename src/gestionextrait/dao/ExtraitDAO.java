/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionextrait.dao;

import java.util.List;

/**
 *
 * @author orion90
 */
public abstract class ExtraitDAO<T> {
    public abstract List<T> getListExtrait();
    public abstract void ajouterExtrait(T model);
    
}
