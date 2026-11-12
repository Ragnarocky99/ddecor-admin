/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ragnar.ddecoradmin.controllers;

import com.ragnar.ddecoradmin.ui.MenuPrincipalView;
import com.ragnar.ddecoradmin.controllers.ArticulosDefController;
import com.ragnar.ddecoradmin.controllers.CheatsController;

/**
 *
 * @author ragnar_DX
 */
public class MenuPrincipalController {

    private static MenuPrincipalView vistaMenu;
    private ArticulosDefController controlArticulosDef = new ArticulosDefController();
    private CheatsController controlCheats = new CheatsController();

    public static void abrirVista() {

        vistaMenu = new MenuPrincipalView();

    }

    public void abrirArticulosDef() {

        controlArticulosDef.abrirVista();

    }
    
    public void abrirCheats() {
    
        controlCheats.abrirVista();
        
    }

}
