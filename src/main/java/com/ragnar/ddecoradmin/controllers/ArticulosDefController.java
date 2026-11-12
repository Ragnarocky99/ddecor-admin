/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ragnar.ddecoradmin.controllers;

import com.ragnar.ddecoradmin.ui.ArticulosDefView;

/**
 *
 * @author ragnar_DX
 */
public class ArticulosDefController {

    public ArticulosDefView vistaArticulosDef = new ArticulosDefView();

    public void abrirVista() {

        vistaArticulosDef.setVisible(true);

    }

    public void cerrarVista() {

        vistaArticulosDef.setVisible(false);

    }

}
