package com.ragnar.ddecoradmin.controllers;

import com.ragnar.ddecoradmin.ui.MenuPrincipalView;
import com.ragnar.ddecoradmin.ui.LoginView;

public class LoginController {
    
        public static LoginView vistaLogin;

        public LoginController(LoginView p) {
        
            vistaLogin = p;
            
        }
    
        public static void cerrarVista(){
        
        
            vistaLogin.setVisible(false);
        }
    
        public static void abrirMenuPrinc() {
    
            MenuPrincipalView vistaMenuPrinc = new MenuPrincipalView();
            
            vistaMenuPrinc.setVisible(true);
    
    }
    
    
}
